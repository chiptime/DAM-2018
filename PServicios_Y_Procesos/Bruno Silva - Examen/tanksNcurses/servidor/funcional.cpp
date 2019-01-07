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

#define MAX_CLIENTS 3

struct Client {
    struct Tanks tank[MAX_CLIENTS];
    struct Bullets bullet;
    int count = 0;
};

const char* program_name;
//struct Tanks tank[MAX_CLIENTS];
struct Client *shared;
struct Client clientes;

void handle_client(int client_fd, int *count) {
    int tecla = 0;
    int contador = *count - 1;
    struct Bullets bullet1;
    do{
        memcpy(&shared->tank[contador], &clientes.tank[contador],sizeof(Client));
        read(client_fd, &bullet1, sizeof(bullet1));
        read(client_fd, &tecla, sizeof(int));
        for(int i = 0; i < MAX_CLIENTS+1; i++){
            printf("La posicion del tanke (%i) es : X = %i, Y = %i \n", i, (int) clientes.tank[i].position.x, (int)clientes.tank[i].position.y);
            if(clientes.tank[i].id == contador){
                teclas(&clientes.tank[i], &bullet1, tecla);
                memcpy(&shared->tank[i], &clientes.tank[i], sizeof(Client));
            }

        }
        Client *paraEnviar = shared;
        write(client_fd, paraEnviar->tank, MAX_CLIENTS * sizeof(Tanks));
        write(client_fd, &bullet1, sizeof(bullet1));
        printf("El numero de cliente es: %i y el id del tanke es: %i\n", *count, clientes.tank[contador].id );
//        sleep(1);
    }while(tecla != 276);
    count -= 1;
    close(client_fd);
}
int main(int argc, char *argv[] ){
    int sock_fd = socket(AF_INET,SOCK_STREAM,0);
    int loopback = 0, port = 0;
    struct sockaddr_in addr;
    int next_option;
    int client_fd;
    int countClient = 0;
    const struct option long_options[] = {
        { "port",       0, NULL, 'p' },
        { "loopback",   0, NULL, 'l' },
        { NULL,         0, NULL,  0  }
    };
    //struct Tanks tank;
    struct Bullets bullet1;

    memset(&addr, 0, sizeof(addr));
    program_name = argv[0];
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

    int memoryShared_id = shmget(IPC_PRIVATE, sizeof(Client)*MAX_CLIENTS, IPC_CREAT | IPC_EXCL | S_IRUSR | S_IWUSR);
    shared = (struct Client*) shmat(memoryShared_id, NULL, 0);

    do {
        socklen_t size = sizeof(addr);
        client_fd = accept(sock_fd, (struct sockaddr *) &addr, &size);
        clientes.tank[countClient++].id = countClient;
        pid_t child_pid;
        child_pid = fork ();
        if (child_pid == 0) {//proceso hijo
            close(sock_fd);
            handle_client(client_fd, &countClient);
            close(client_fd);
            client_fd = 0;
            exit(0);
        }
        else if (child_pid > 0) {//proceso padre
//            close(client_fd);
        }
} while(true);
close(sock_fd);
return EXIT_SUCCESS;
}
