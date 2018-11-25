#include <stdlib.h>
#include <stdio.h>
#include <stdint.h>
#include <arpa/inet.h>
#include <sys/socket.h>

int main()
{
    struct sockaddr_in dirServer;
    dirServer.sin_family = AF_INET;
    dirServer.sin_addr.s_sddr = INADRR_ANY;
    dirServer.sin_port = htons(8080);

    int server = socket(AF_INET, SOCK_STREAM, 0);

    int activado = 1;
    setsockopt(server, SOL_SOCKET, SO_REUSEADDR, &activado, sizeof(activado));

    if(bind(server, (void*) &dirServer, sizeof(dirServer)) != 0){
        perror("Fallo el bind");
        return 1;
    }

    printf("Estoy escuchando\n");
    listen(servidor, 100);

    struct sockaddr_in dirClient;
    unsigned int sizeDirClient;
    int client = accept(server, (void*) &dirClient, &sizeDirClient);

    printf("Recibi una conexion en %d!!\n", client);
    send(client, "Hola NetCat!", 13, 0);

    char* buffer = malloc(1000);

    while(1) {
        int bytesGet = recv(client, buffer, 1000, 0);
        if(bytesGet <= 0) {
            perror("El chabon se desconecto o bla.");
            return 1;
        }

        buffer[bytesGet] = '\0';
        printf("Me llegaron %d bytes con %s\n", bytesGet, buffer);
    }
    free(buffer);

    return 0;
}
