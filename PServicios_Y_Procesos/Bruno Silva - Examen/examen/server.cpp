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

/*Comienza creando un servidor básico INET orientado a conexión que sea capaz de
  escuchar bien en INADDR_LOOPBACK o en INADDR_ANY, según se especifique la op-
  ción -l (–loopback) o no en la invocación en línea de comandos. Sí, INADDR_ANY es
  por defecto (léase con voz de Ángel). Permite que el puerto lo especifique el usario al
  levantar el servidor.*/
const char* program_name;

void handle_client(int client_fd) {
    bool finish = false;
    do {
        int count;
        int code = read(client_fd, &count, sizeof(int));
        if (code <= 0) {
            finish = true;
        }
        else {
            char * texto = (char *) malloc(count * sizeof(char));
            read(client_fd, texto, count * sizeof(char));
            char *token = strtok(texto, " ");
            //            printf("READ:%s\n", texto);
            int pipes[2];
            pid_t pid;
            pipe (pipes);
            pid = fork ();
            if (pid == (pid_t) 0) {
                close (pipes[1]);
                dup2 (pipes[0], STDIN_FILENO);
                execlp ("sort", "sort", 0);
            }else {
                FILE* stream;
                close (pipes[0]);
                stream = fdopen (pipes[1], "w");
                while(token != NULL) {
                      fprintf(stream, "%s\n", token);
                      token =  strtok(NULL, " ");
                  }
  ////              fprintf (stream, STDIN_FILENO);
//                fprintf(stream, texto);//saca texto post sort
                fflush (stream);
                close (pipes[1]);
                waitpid (pid, NULL, 0);
            }
        }
    }     while(!finish);
    close(client_fd);

}

/*Mejora el programa anterior para que cada conexión entrante sea atendida en un sub-
  proceso nuevo, y que este último no quede zombie. (Que para Halloween ya tenemos
  la Santa Comparsa; que es española y da mucho más miedo).*/
int main(int argc, char *argv[] ){
    int sock_fd = socket(AF_INET,SOCK_STREAM,0);
    int loopback = 0;
    struct sockaddr_in addr;

    memset(&addr, 0, sizeof(addr));

    int next_option;
    const struct option long_options[] = {
        { "port",     0, NULL, 'p' },
        { "loopback",   0, NULL, 'l' },
        { NULL,       0, NULL, 0   }
    };
    program_name = argv[0];
    do {
        next_option = getopt_long (argc, argv, "p:l",
                long_options, NULL);
        switch (next_option)
        {
            case 'p':
                fprintf(stdout," Te vas a conectar al puerto: %s\n", argv[2] );
                break;
            case 'l':
                fprintf(stdout," Estas usando INADDR_LOOPBACK.\n");
                loopback = 1;
                break;
            default:
                break;
        }
    }
    while (next_option != -1);

    addr.sin_family = AF_INET;
    addr.sin_port = htons(8877);
    fprintf(stdout,"Estado de loopback: %i\n", loopback);
    if(loopback)
        addr.sin_addr.s_addr = htonl(INADDR_LOOPBACK);
    else
        addr.sin_addr.s_addr = INADDR_ANY;

    int error = bind(sock_fd,(struct sockaddr *) &addr, sizeof(addr));

    if(error != 0) {
        printf("Failed to bind\n");
        exit(1);
    }
    else
        fprintf(stdout, "He hecho un bind a %i\n", (int) addr.sin_addr.s_addr  );

    listen(sock_fd, 3);

    do {
        socklen_t size = sizeof(addr);
        int client_fd = accept(sock_fd, (struct sockaddr *) &addr, &size);

        pid_t child_pid;
        child_pid = fork ();
        if (child_pid == 0) {
            close (STDIN_FILENO);
            close (STDOUT_FILENO);
            close (client_fd);
        }
        else if (child_pid > 0) {
            if(client_fd != -1)
                handle_client(client_fd);
            waitpid(child_pid,0,0);

            close (client_fd);
        }
    } while(true);
    close(sock_fd);
    return EXIT_SUCCESS;
}
