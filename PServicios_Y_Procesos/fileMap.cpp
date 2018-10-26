#include <stdlib.h>
#include <stdio.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <sys/stat.h>
#include <time.h>
#include <unistd.h>
#include <string.h>
#define FILE_LENGTH 0x100
/* Return a uniformly random number in the range [low,high].  */
int random_range (unsigned const low, unsigned const high)
{
    unsigned const range = high - low + 1;
    return low + (int) (((double) range) * rand () / (RAND_MAX + 1.0));
}
int main (int argc, char* const argv[])
{
    char* cuadrado[] = {
    "********",
    "*123456*",
    "*223456*",
    "*323456*",
    "********"
    };

    int cuadrado_memory = 0;
    int fd;
    void* file_memory;
    /* Seed the random number generator.  */
    srand (time (NULL));
    /* Prepare a file large enough to hold an unsigned integer.  */
    fd = open (argv[1], O_RDWR
            |
            O_CREAT, S_IRUSR
            |
            S_IWUSR);
    lseek (fd, FILE_LENGTH+1, SEEK_SET);
    write (fd, "", 1);
    lseek (fd, 0, SEEK_SET);
    /* Create the memory mapping.  */
    file_memory = mmap (0, FILE_LENGTH, PROT_WRITE, MAP_SHARED, fd, 0);
    close (fd);

    
    for(int i = 0; i < 6; i++){
        sprintf((char*) file_memory + cuadrado_memory, "%s\n", cuadrado[i]);
    cuadrado_memory += strlen(cuadrado[i]) + 1;

    }
    /* Release the memory (unnecessary because the program exits).  */
    munmap (file_memory, FILE_LENGTH);
    return 0;
}
