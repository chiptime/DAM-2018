#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <string.h>
#include <unistd.h>
#include <errno.h>
#include <locale.h>
#include <stdio.h>
#include <termios.h>
#include <string.h>

//Local Files
#include "../libreria/framebuffer/png.h"
#include "../libreria/framebuffer/sprite_render.h"
#include "../libreria/global/global.h"
#include "../libreria/mapa/mapa.h"
#include "../libreria/ncurses/ncurses.h"
#include "../libreria/tank/tank.h"
#include "../libreria/bullet/bullet.h"
#include "../libreria/teclas/teclas.h"

int finish_program;
int kbhit(void)
{
    struct termios oldt, newt;
    int ch;
    int oldf;

    tcgetattr(STDIN_FILENO, &oldt);
    newt = oldt;
    newt.c_lflag &= ~(ICANON | ECHO);
    tcsetattr(STDIN_FILENO, TCSANOW, &newt);
    oldf = fcntl(STDIN_FILENO, F_GETFL, 0);
    fcntl(STDIN_FILENO, F_SETFL, oldf | O_NONBLOCK);

    ch = getchar();

    tcsetattr(STDIN_FILENO, TCSANOW, &oldt);
    fcntl(STDIN_FILENO, F_SETFL, oldf);

    if(ch != EOF)
    {
        ungetc(ch, stdin);
        return 1;
    }

    return 0;
}
int nGetch()
{
    struct termios oldt, newt;
    int ch;
    tcgetattr(STDIN_FILENO, &oldt);

    newt = oldt;
    newt.c_lflag &= ~(ICANON | ECHO);

    tcsetattr(STDIN_FILENO, TCSANOW, &newt);
    ch = getchar();
    //    printf("Tecla: %i\r", int);

    tcsetattr(STDIN_FILENO, TCSANOW, &oldt);

    return ch;
}
int rGetch(){
    int arrow = nGetch();
    //    int arrow = -1;
    if ( arrow == '\033') { // if the first value is esc
        nGetch(); // skip the [
        arrow = nGetch();
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
                return 260; //izquierda
                break;
            default:
                break;
        }
    }
    switch(arrow){
        case 'b':
            return arrow;
        case 'p':
            return arrow;
        default:
            return -1;
    }
    return arrow;
}
int anguleDir(int dir) {
    switch(dir){
        case 1:
            return 0;
            break;
        case 2:
            return 270;
            break;
        case 3:
            return 180;
            break;
        case 4:
            return 90;
            break;
        default:
            return 0;
    }
    return 0;
}
void handle_server(int server_fd, int numTeclas, Client *c){
    write(server_fd, &numTeclas, sizeof(int));
    read(server_fd, c, sizeof(Client));
}
int main(){
    struct Client cliente;
    Sprite background = load_sprite((char *) "map1.png");
    Sprite tank = load_sprite((char *) "tank.png");
    Sprite bullet = load_sprite((char *) "bullet1.png");
    Sprite skull1 = load_sprite((char *) "skull2.png");
    Sprite skull2 = load_sprite((char *) "skull1.png");
    Sprite skull3 = load_sprite((char *) "skull3.png");
    Sprite_Render render;

    init_sprite_render(&render);

    int tecla = -1;
    int sock_fd = socket(AF_INET,SOCK_STREAM,0);
    struct sockaddr_in addr;

    setlocale(LC_ALL,"");
    memset(&addr, 0, sizeof(addr));

    addr.sin_family = AF_INET;
    addr.sin_port = htons(8888);
    addr.sin_addr.s_addr = inet_addr("127.0.0.1");
    socklen_t size = sizeof(addr);

    int server_fd = connect(sock_fd, (struct sockaddr *) &addr, size);
    if(server_fd != -1)
        handle_server(sock_fd, 666, &cliente);
    else
        printf("No hay nada\n");
    iniciar_Curses();

    while(tecla != 'p'){
        printSprite(render, 0, 0, background);
        //	printf("x: %i Y: %i\r",tank.image.width, tank.image.height);
        //	printf("x: %i Y: %i\r",cliente.tank[0].sprite.image.width, cliente.tank[0].sprite.image.height);
        for(int i = 0; i <MAX_CLIENTS;i++){
            //memcpy(&cliente.tank[i].sprite , &tank, sizeof(Sprite));//porque no se guarda el sprite tank en la struct
            //            printf("Position bala: x = %i y = %i \r", (int) cliente.tank[0].balas.position.x, (int) cliente.tank[0].balas.position.y);
            printSpriteRotate(render, cliente.tank[i].position.x, cliente.tank[i].position.y, tank, anguleDir(cliente.tank[i].dir));
            if(cliente.tank[i].die){
            //    printf("Died %i: %i \r", i, (int) cliente.tank[i].die);
                printSprite(render, cliente.tank[i].whereDied.x, cliente.tank[i].whereDied.y, skull1);
                memcpy(render.fb_map, render.fb_temp, render.screensize);
                getchar();//              sleep(2);
                printSprite(render, cliente.tank[i].whereDied.x, cliente.tank[i].whereDied.y, skull2);
                memcpy(render.fb_map, render.fb_temp, render.screensize);
                getchar();
//                sleep(2);
                printSprite(render, cliente.tank[i].whereDied.x, cliente.tank[i].whereDied.y, skull3);
                memcpy(render.fb_map, render.fb_temp, render.screensize);
                getchar();
//                sleep(2);
            }
            else
                printSpriteRotate(render, cliente.tank[i].balas.position.x, cliente.tank[i].balas.position.y, bullet, anguleDir(cliente.tank[i].balas.dir));
            printf("KILLS: Tank %i: %i, Tank %i: %i, Tank %i: %i\r", 1, cliente.tank[0].kills, 2,cliente.tank[1].kills,3,cliente.tank[2].kills);
        }
        if (kbhit()){
            tecla = rGetch();
        }else
            tecla  = -1;
        handle_server(sock_fd ,tecla, &cliente);
        memcpy(render.fb_map, render.fb_temp, render.screensize);
        usleep(20000);
    }
    free_render(&render);
    printf("Estamos desconectando\n");
    close(sock_fd);
    return EXIT_SUCCESS;
}
