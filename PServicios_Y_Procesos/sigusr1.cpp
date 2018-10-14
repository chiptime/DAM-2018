#include <stdio.h>
#include <signal.h>
#include <string.h>
#include <sys/types.h>
#include <unistd.h>

sig_atomic_t sigusr1_count =  0;

void handler (int signal_number)
{
    ++sigusr1_count;
}

int main()
{
    struct sigaction sa;
    memset(&sa, 0, sizeof(sa));

    printf("The process ID is: %i", (int) getpid());
    sa.sa_handler = &handler;
    sigaction(SIGUSR1,&sa,NULL);
    sleep(10);

    printf("SIGUSR1 was raised %i times\n", sigusr1_count);
    return 0;
}
