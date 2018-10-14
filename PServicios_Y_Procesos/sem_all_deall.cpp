#include <sys/ipc.h>
#include <sys/sem.h>
#include <sys/types.h>

union semun {
    int val;
    struct semid_ds *buf;
    unsigned short int *array;
    struct seminfo *_buf;
};

int binary_semaphore_allocation (key_t key, int sem_flags)
{
    return semget (key,1,sem_flags);
}

int binary_semaphore_deallocate (int semid)
{
    union semun ignored_argument;
    return semctl (semid, 1, IPC_RMID, ignored_argument);
}

int main (int argcv, char *args[]){
    return 0;
}
