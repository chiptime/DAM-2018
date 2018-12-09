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


void handle_server(int server_fd, int numTeclas, Client *c){
    write(server_fd, &numTeclas, sizeof(int));
//    printf("Datos enviados\n");

    read(server_fd, c, sizeof(Client));
//    printf("Datos recibidos\n");
}
int main(){
    struct Client cliente;
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

    while(tecla != 276){
        clear();
        printMap();
        for(int i = 0; i <MAX_CLIENTS;i++){
            printTank(cliente.tank[i]);
            printBullet(&cliente.tank[i].balas, cliente.tank[i].dir);
            DEBUG(40+i, 54, "Tank: x=%i, y=%i",(int) cliente.tank[i].position.x,(int) cliente.tank[i].position.y);
            DEBUG(33+i, 54, "Bullet: x=%i, y=%i",(int) cliente.tank[i].balas.position.x,(int) cliente.tank[i].balas.position.y);
            DEBUG(40-7-i,0,"Jugador %i, tiene %i Kills",i, cliente.tank[i].kills);
            if(cliente.tank[cliente.id].die == 1){
                DEBUG(30,50, "TE MAMASTE WEY");
                sleep(1);
            }
            else
                DEBUG(30,50, "          ");

        }
        tecla = getch();
        handle_server(sock_fd ,tecla, &cliente);
        usleep(20000);
    }
    finalizar_Curses();
    printf("Estamos desconectando\n");
    close(sock_fd);
    return EXIT_SUCCESS;
}
