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
//Local Files
#include "../libreria/global/global.h"
#include "../libreria/mapa/mapa.h"
#include "../libreria/ncurses/ncurses.h"
#include "../libreria/tank/tank.h"
#include "../libreria/bullet/bullet.h"
#include "../libreria/teclas/teclas.h"

#define MAX_CLIENT 3

void handle_server(int server_fd, int numTeclas, Tanks *t, Bullets b, Bullets *b1) {
    write(server_fd, &b,sizeof(b));
    write(server_fd, &numTeclas, sizeof(int));
    printf("Datos enviados\n");

    read(server_fd, t, MAX_CLIENT * sizeof(Tanks));
    for(int i = 0; i < MAX_CLIENT; i++)
        printf("Tanks (%i): X = %i, Y = %i\n", i, (int) t[i].position.x, (int) t[i].position.y);
    read(server_fd, b1, sizeof(Bullets));
    printf("Datos recibidos\n");
}
int main(){
    struct Tanks tank[MAX_CLIENT];
    struct Bullets bullet = {0,0};
    int tecla = -1;
    int sock_fd = socket(AF_INET,SOCK_STREAM,0);
    struct sockaddr_in addr;
    int dir = 0;

    for(int i = 0; i < MAX_CLIENT; i++)
      tank[i] = {7,7};

    setlocale(LC_ALL,"");
    memset(&addr, 0, sizeof(addr));

    addr.sin_family = AF_INET;
    addr.sin_port = htons(8888);
    addr.sin_addr.s_addr = inet_addr("127.0.0.1");
    socklen_t size = sizeof(addr);

    int server_fd = connect(
            sock_fd, (struct sockaddr *) &addr, size);
    if(server_fd != -1)
        handle_server(
                sock_fd, 666, tank, bullet, &bullet);
    else
        printf("No hay nada\n");
    iniciar_Curses();

    while(tecla != 276){
        clear();
        printMap();
        for(int i = 0; i <MAX_CLIENT;i++){//TODO mejorar algoritmo de id para tankes
            printTank(tank[i]);//TODO es posible que haya que modificar el pintado para tankes fuera del marco de juego
        //        dir = teclas(&tank, &bullet);
            printBullet(tank[i],&bullet, bullet, dir);
        }
        DEBUG(40-10,0,"dir is %i", dir);
        tecla = getch();
        handle_server(
                sock_fd ,tecla, tank, bullet, &bullet);
        usleep(20000);
//        sleep(3);
    }
    finalizar_Curses();
    printf("Estamos desconectando\n");
    close(sock_fd);
    return EXIT_SUCCESS;
}
