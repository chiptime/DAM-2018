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


int main(){
/*Crea un programa –como parte del Cliente Perdido– que lea una lista de palabras
separadas por saltos de linea. Dicha lista es será de longitud variable y quedará alma-
cenada en char buffer[GRANDE];*/
//    char buffer[GRANDE] = (char*) malloc(GRANDE * sizeof(char));
    char* buffer = (char*) malloc(100);

    printf("Escribe algo.\n");
    scanf("%[^\n]", buffer);
    printf("%s\n", buffer);
    free(buffer);

   return EXIT_SUCCESS;
}
