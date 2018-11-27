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

#include <locale.h>
//Local Files
#include "../libreria/global/global.h"
#include "../libreria/mapa/mapa.h"
#include "../libreria/ncurses/ncurses.h"
#include "../libreria/tank/tank.h"
#include "../libreria/bullet/bullet.h"
#include "../libreria/teclas/teclas.h"

#define MAX_CLIENTS 10

/*Comienza creando un servidor básico INET orientado a conexión que sea capaz de
  escuchar bien en INADDR_LOOPBACK o en INADDR_ANY, según se especifique la op-
  ción -l (–loopback) o no en la invocación en línea de comandos. Sí, INADDR_ANY es
  por defecto (léase con voz de Ángel). Permite que el puerto lo especifique el usario al
  levantar el servidor.*/
const char* program_name;

void handle_client(int client_fd) {
    int tecla = 0;
    struct Tanks tank1;
    struct Bullets bullet1;
    do{
        read(client_fd, &tank1, sizeof(tank1));
        read(client_fd, &bullet1, sizeof(bullet1));
        read(client_fd, &tecla, sizeof(int));

        teclas(&tank1, &bullet1, tecla);

        write(client_fd, &tank1, sizeof(tank1));
        write(client_fd, &bullet1, sizeof(bullet1));

   /*     system("clear");
        printf("Hemos recibido la tecla: %i\r\n", tecla);
        printf("Posición tanque: %f + %f  \r\n",tank1.position.x,tank1.position.y);
        printf("Posición bala: %f + %f\r\n",bullet1.position.x,bullet1.position.y);
        */
    }while(tecla != 276);
    close(client_fd);

    /*    int pipes[2];
          int pipesExtra[2];
          pid_t pid;

          read(client_fd, texto, count * sizeof(char));
          char *token = strtok(texto, " ");
          pipe (pipes);
          pipe (pipesExtra);
          pid = fork ();
          if (pid == (pid_t) 0) {
          close(client_fd);
          close (pipes[1]);
          close (pipesExtra[0]);

          dup2 (pipes[0], STDIN_FILENO);
          dup2 (pipesExtra[1], STDOUT_FILENO);
          execlp ("sort", "sort", NULL);
          fprintf(stderr, "FALLO AL EJECUTAR");
          close (pipes[0]);
          close (pipesExtra[1]);
          abort();
          }else {
          printf("%i\n", getpid());
          close (pipes[0]);
          close (pipesExtra[1]);

          while(token != NULL) {
          write(pipes[1], token, strlen(token) );
          strcpy(token, "\n");
          write(pipes[1], token, strlen(token) );
          token =  strtok(NULL, " ");
          }
          close(pipes[1]);

          read(pipesExtra[0], texto, 100 * sizeof(char));

          int num = strlen(texto);
          write(client_fd, &num, sizeof(num));

          write(client_fd, texto, num * sizeof(char));
          close(pipesExtra[0]);
          waitpid (pid, NULL, 0);

          }
          */
}

/*Mejora el programa anterior para que cada conexión entrante sea atendida en un sub-
  proceso nuevo, y que este último no quede zombie. (Que para Halloween ya tenemos
  la Santa Comparsa; que es española y da mucho más miedo).*/
int main(int argc, char *argv[] ){
    int sock_fd = socket(AF_INET,SOCK_STREAM,0);
    int loopback = 0, port = 0, sd, max_fds, activity;
    struct sockaddr_in addr;
    fd_set read_fds;
    int next_option;
    int client_fd[MAX_CLIENTS];
    const struct option long_options[] = {
        { "port",       0, NULL, 'p' },
        { "loopback",   0, NULL, 'l' },
        { NULL,         0, NULL,  0  }
    };

    //    struct Tanks tanks[10];
    for(int i = 0; i < MAX_CLIENTS;  i++)
        client_fd[i] = 0;

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
    do {
        FD_ZERO(&read_fds);
        socklen_t size = sizeof(addr);
        FD_SET(sock_fd, &read_fds);
        max_fds = sock_fd;

        for(int i=0; i < MAX_CLIENTS; i++){
            sd = client_fd[i];
            if(sd > 0)
                FD_SET(sd, &read_fds);
            if(sd > max_fds)
                max_fds = sd;
        }

        activity = select(max_fds + 1, &read_fds, NULL, NULL, NULL);

        if(FD_ISSET(sock_fd, &read_fds)){
            int new_socket = accept(sock_fd, (struct sockaddr *) &addr, &size);
            for(int i = 0; i < MAX_CLIENTS; i++)
                if(client_fd[i] == 0){
                    client_fd[i] = new_socket;
                    printf("Adding to list of sockets as %d\n" , i);
                    break;
                }
        }
        for(int i = 0; i < MAX_CLIENTS; i++){
            sd = client_fd[i];

            if(FD_ISSET(sd, &read_fds)){

            pid_t child_pid;
            child_pid = fork ();
            if (child_pid == 0) {//proceso hijo
                close(sock_fd);
                handle_client(client_fd[i]);
                getpeername(sd, (struct sockaddr*) &addr, &size);
                printf("Host disconnected , ip %s , port %d \n" ,
                        inet_ntoa(addr.sin_addr) , ntohs(addr.sin_port));
                close(sd);
                client_fd[i] = 0;

                exit(0);
            }
            else if (child_pid > 0) {//proceso padre
                close(client_fd[i]);
                waitpid(child_pid,0,0);
            }
            }
        }
    } while(true);
    close(sock_fd);
    return EXIT_SUCCESS;
}


            /*
            if(int valread = read(sd, buffer, 1024) == 0){
                    getpeername(sd, (struct sockaddr*) &addr, &size);
                    printf("Host disconnected , ip %s , port %d \n" ,
                            inet_ntoa(address.sin_addr) , ntohs(address.sin_port));
                    close(sd);
                    client_fd[i] = 0;
                }else{
                    buffer[valread] = '\0';
                    send(sd, buffer, strlen(buffer), 0);
                }
            }
        }
*/
/*
        pid_t child_pid;
        child_pid = fork ();
        if (child_pid == 0) {//proceso hijo
            close(sock_fd);
            handle_client(client_fd);
            exit(0);
        }
        else if (child_pid > 0) {//proceso padre
            close(client_fd);
            waitpid(child_pid,0,0);
        }
        */
