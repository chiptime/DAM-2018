#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main (){
    pid_t pHijo_pid;

    printf("el proceso padre tiene el pid : %i\n", (int) getpid());

    pHijo_pid = fork();
    if(pHijo_pid != 0){
        printf("Este es el proceso padre pid: %i\n", (int) getppid());
        printf("Este es el proceso hijo pid: %i\n", (int) pHijo_pid);
    }else
        printf("Este es el proceso hijo pid: %i\n ", (int) getpid());
    return 0;

}
