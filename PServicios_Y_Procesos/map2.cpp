#include <stdio.h>
#include <sys/mman.h>
#include <sys/stat.h>
#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <time.h>
#include <unistd.h>

#define FILE_LENGTH 0x100

int main (int argc, char* const argv[])
{
    int fd;
    void* file_memory;
    int integer;

    fd = open (argv[1], O_RDWR | O_CREAT, S_IRUSR | S_IWUSR);
    lseek(fd, FILE_LENGTH+1, SEEK_SET);
    write(fd,"",1);
    lseek(fd, 0, SEEK_SET);

    file_memory = mmap(0, FILE_LENGTH, PROT_WRITE, MAP_SHARED, fd, 0);

    close(fd);

//    scanf(file_memory, "%i", &integer);
    printf("Value: %d\n", integer);
    sprintf((char*) file_memory, "%d\n", 2*integer);

    munmap(file_memory, FILE_LENGTH);

    return 0;
}
