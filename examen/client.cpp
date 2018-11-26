#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>          /* See NOTES */
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <string.h>
#include <unistd.h>
/*Haz de tu programa un cliente que pueda conectarse a un servidor INET básico para
poder enviarle el buffer, recibir su respuesta e imprimirla.*/
void handle_server(int server_fd) {

    int GRANDE = 0;
    char buffer[GRANDE] = "";

    printf("Escribe algo.\n");
    scanf("%s", buffer);

    int count = strlen(buffer);
    write(server_fd, &count, sizeof(int));
    write(server_fd, buffer, count * sizeof(char));
}

int main(){
/*Crea un programa –como parte del Cliente Perdido– que lea una lista de palabras
separadas por saltos de linea. Dicha lista es será de longitud variable y quedará alma-
cenada en char buffer[GRANDE];*/
//    char buffer[GRANDE] = (char*) malloc(GRANDE * sizeof(char));
    int sock_fd = socket(AF_INET,SOCK_STREAM,0);

    struct sockaddr_in addr;

    memset(&addr, 0, sizeof(addr));

    addr.sin_family = AF_INET;
    addr.sin_port = htons(8888);
    addr.sin_addr.s_addr = inet_addr("127.0.0.1");

    socklen_t size = sizeof(addr);

    int server_fd = connect(sock_fd, (struct sockaddr *) &addr, size);

    if(server_fd != -1)
        handle_server(sock_fd);
    else
      printf("No hay nada\n");


    close(sock_fd);
    return EXIT_SUCCESS;
}
