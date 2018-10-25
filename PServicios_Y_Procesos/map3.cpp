#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <sys/mman.h>
#include <fcntl.h>
#include <time.h>
#include <unistd.h>
#include <string.h>

#define FILE_LENGTH 0x100

int
main (int argc, char* argv[])
{
    char* cuadrado[] = {
    "********",
    "*123456*",
    "*223456*",
    "*323456*",
    "********"
    };

    int fd;
    void* file_memory;
    int cuadrado_length = 0;

    fd = open(argv[1], O_RDWR | O_CREAT, S_IRUSR | S_IWUSR);
    lseek (fd, FILE_LENGTH+1, SEEK_SET);
    write(fd, "",1);
    lseek(fd,0,SEEK_SET);

    file_memory = mmap(0,FILE_LENGTH, PROT_WRITE,MAP_SHARED,fd,0);
    close(fd);

    for(int i = 0; i < 5; i++){
        sprintf( (char*) file_memory + cuadrado_length, "%s\n", cuadrado[i]);
    cuadrado_length += strlen(cuadrado[i]) + 1;
    }
    munmap(file_memory, FILE_LENGTH);
    return 0;
}
