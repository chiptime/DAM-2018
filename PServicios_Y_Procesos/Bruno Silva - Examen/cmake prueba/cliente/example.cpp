#include <stdio.h>
#include <termios.h>
#include <string.h>
#include "../libreria/framebuffer/png.h"
#include "../libreria/framebuffer/sprite_render.h"

#include "example.h"
int finish_program;
int getch()
{
    struct termios oldt, newt;
    int ch;
    tcgetattr(STDIN_FILENO, &oldt);

    newt = oldt;
    newt.c_lflag &= ~(ICANON | ECHO);

    tcsetattr(STDIN_FILENO, TCSANOW, &newt);
    ch = getchar();
    tcsetattr(STDIN_FILENO, TCSANOW, &oldt);

    return ch;
}
int rGetch(){
    int arrow = getch();
    if ( arrow == '\033') { // if the first value is esc
        getch(); // skip the [
        arrow = getch();
        switch(arrow) { // the real value
            case 'A':
                return 259;//arriba
                break;
            case 'B':
                return 258;//abajo
                break;
            case 'C':
                return 261;//derecha
                break;
            case 'D':
                return 260; //isquierda
                break;
            default:
                return arrow;
        }
    }else
        return arrow;
}
void keys(int *arrow, int *x, int *y){
    *arrow = getch();
    if ( *arrow == '\033') { // if the first value is esc
        getch(); // skip the [
        *arrow = getch();
        switch(*arrow) { // the real value
            case 'A':
                *y = *y - 5;
                //printf("Pulsada fecha arriba\n");
                break;
            case 'B':
		*y = *y + 5;
//                printf("pulsada fecha abajo\n");
                break;
            case 'C':
                *x = *x + 5;
  //              printf("pulsada fecha derecha\n");
                break;
            case 'D':
                *x = *x - 5;
    //            printf("pulsada fecha isquierda\n");
                break;
        }
    }else
	switch(*arrow){
		case 'b':
			printf("\nbala fuera");
		break;
	}

/*printf("checkRIGHT: %i, checkDOWN: %i, checkLEFT: %i, checkUP: %i",
          checkRIGHT,     checkDOWN,     checkLEFT,     checkUP);//"x: %i, y: %i \r", x, y);*/
}
int main() {
    int y = 100, x = 100;
    Sprite background = load_sprite((char *) "background1.png"); //"tank3.png");
    Sprite tank = load_sprite((char *) "tank3.png");
    Sprite_Render render;

    init_sprite_render(&render);

    int arrow;
    while(arrow != 'p'){
        arrow = rGetch();
//        printf("Tecla: %i", arrow);
        keys(&arrow, &x, &y);
        printSprite(render, 0, 0, background);
        printSprite(render, x, y, tank);
        memcpy(render.fb_map, render.fb_temp, render.screensize);
    }
    free_render(&render);

    printf("Principal cerrado\n");
    return 0;
}

