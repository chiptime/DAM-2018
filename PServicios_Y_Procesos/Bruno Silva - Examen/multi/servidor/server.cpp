#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>          /* See NOTES */
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <string.h>
#include <getopt.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <errno.h>
#include <sys/time.h>
#include <uuid/uuid.h>
#include <locale.h>
#include <sys/shm.h>
#include <sys/stat.h>
//Local Files
#include "../libreria/global/global.h"
#include "../libreria/mapa/mapa.h"
#include "../libreria/ncurses/ncurses.h"
#include "../libreria/tank/tank.h"
#include "../libreria/bullet/bullet.h"
#include "../libreria/teclas/teclas.h"


const char* program_name;
struct Client *shared;
struct Client clientes;

void handle_client(int client_fd) {
    int tecla = 0;
    for(int i = 0; i <MAX_CLIENTS; i++){
      shared->tank[i].balas.position.x = 30;
      shared->tank[i].balas.position.y = 30;
    }
    do{
        read(client_fd, &tecla, sizeof(int));

        for(int i = 0; i < MAX_CLIENTS; i++){
            if(clientes.id == i)
              shared->tank[i].dir =  teclas(&shared->tank[i], &shared->tank[i].balas, tecla);
            printBullet(&shared->tank[i].balas, shared->tank[i].dir);
        }
        crashBullet(shared);
        write(client_fd, shared, sizeof(Client));
    }while(tecla != 276);
    close(client_fd);
}
int main(int argc, char *argv[] ){//TODO implementar sistema de entra salida de jugadores, retirar jugadores al salir
    int sock_fd = socket(AF_INET,SOCK_STREAM,0);
    int loopback = 0, port = 0;
    struct sockaddr_in addr;
    int next_option;
    int client_fd;
    const struct option long_options[] = {//TODO refactorizar, sacar opciones a un archivo externo y permitir elegir la ip
        { "port",       0, NULL, 'p' },
        { "loopback",   0, NULL, 'l' },
        { NULL,         0, NULL,  0  }
    };

    memset(&addr, 0, sizeof(addr));
    do {
        next_option = getopt_long (argc, argv, "p:l",
                long_options, NULL);
        switch (next_option)
        {
            case 'p':
                fprintf(stdout," Te vas a conectar al puerto: %s\n", argv[2] );
                port = 1;
                break;
            case 'l':
                fprintf(stdout," Estas usando INADDR_LOOPBACK.\n");
                loopback = 1;
                break;
            default:
                break;
        }
    }while (next_option != -1);

    addr.sin_family = AF_INET;
    if(port)
        addr.sin_port = htons(atoi (argv[2]));
    else
        addr.sin_port = htons(8888);

    fprintf(stdout,"Estado de loopback: %i\n", loopback);
    if(loopback)
        addr.sin_addr.s_addr = htonl(INADDR_LOOPBACK);
    else
        addr.sin_addr.s_addr = INADDR_ANY;

    if(bind(sock_fd,(struct sockaddr *) &addr, sizeof(addr)) < 0) {
        printf("Failed to bind\n");
        exit(1);
    }
    else
        fprintf(stdout, "He hecho un bind a %i\n", (int) addr.sin_addr.s_addr  );

    listen(sock_fd, 3);

    int memoryShared_id = shmget(IPC_PRIVATE, sizeof(Client), IPC_CREAT | IPC_EXCL | S_IRUSR | S_IWUSR);
    shared = (struct Client*) shmat(memoryShared_id, NULL, 0);
    bzero(&clientes, sizeof(Client));
    memcpy(shared, &clientes, sizeof(Client));
    do {
        socklen_t size = sizeof(addr);
        client_fd = accept(sock_fd, (struct sockaddr *) &addr, &size);
        clientes.id = clientes.count++;
        pid_t child_pid;
        child_pid = fork ();
        if (child_pid == 0) {//proceso hijo
            close(sock_fd);
            handle_client(client_fd);
            close(client_fd);
            client_fd = 0;
            exit(0);
        }
        else if (child_pid > 0) {//proceso padre
        }
} while(true);
close(sock_fd);
return EXIT_SUCCESS;
}
