#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>          /* See NOTES */
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <string.h>
#include <unistd.h>
#include <errno.h>
#include <locale.h>
//Local Files
#include "../libreria/global/global.h"
#include "../libreria/mapa/mapa.h"
#include "../libreria/ncurses/ncurses.h"
#include "../libreria/tank/tank.h"
#include "../libreria/bullet/bullet.h"
#include "../libreria/teclas/teclas.h"
/*Haz de tu programa un cliente que pueda conectarse a un servidor INET básico para
  poder enviarle el buffer, recibir su respuesta e imprimirla.*/
void handle_server(int server_fd, int numTeclas, Tanks t, Bullets b) {


    write(server_fd, &t,sizeof(t));
    write(server_fd, &b,sizeof(b));
    write(server_fd, &numTeclas, sizeof(int));

}


int main(){
    /*Crea un programa –como parte del Cliente Perdido– que lea una lista de palabras
      separadas por saltos de linea. Dicha lista es será de longitud variable y quedará alma-
      cenada en char buffer[GRANDE];*/
    //    char buffer[GRANDE] = (char*) malloc(GRANDE * sizeof(char));
    int sock_fd = socket(AF_INET,SOCK_STREAM,0);
    struct Tanks tank1 = {7,7};
    struct Bullets bullet = {0,0};
    struct sockaddr_in addr;

    memset(&addr, 0, sizeof(addr));

    addr.sin_family = AF_INET;
    addr.sin_port = htons(8888);
    addr.sin_addr.s_addr = inet_addr("127.0.0.1");

    socklen_t size = sizeof(addr);

    int server_fd = connect(sock_fd, (struct sockaddr *) &addr, size);
    if(server_fd != -1)
        handle_server(sock_fd, 666, tank1, bullet);
    else
        printf("No hay nada\n");
    /*
       char str[100];
       int num;
       read(sock_fd, &num, sizeof(num));

       int i = read(sock_fd, str, sizeof(char) *num);

       if ( i < 0) {
       fprintf(stderr, "read error: %s\n", strerror(errno));
       finalizar_Curses();
       exit(EXIT_FAILURE);
       }
       */
    int dir = 0;
    int tecla = -1;
    setlocale(LC_ALL,"");


    iniciar_Curses();
    //getmaxyx(stdscr,row,col);

    while(tecla != 276){//teclas(&tank1, &bullet, tecla) != KEY_BREAK){
        clear();
        printMap();
        printTank(tank1);
        //        dir = teclas(&tank1, &bullet);
        printBullet(tank1,&bullet, bullet, dir);
        DEBUG(40-10,0,"dir is %i", dir);
        tecla = getch();
        handle_server(sock_fd ,tecla, tank1, bullet);
        usleep(20000);
    }
    finalizar_Curses();

    // printf("Esta recibiendo: %i\n", i);
    //printf("ESTO ESTAMOS RECIBIENDO:%s\n\n", str);
    close(sock_fd);
    return EXIT_SUCCESS;
}
