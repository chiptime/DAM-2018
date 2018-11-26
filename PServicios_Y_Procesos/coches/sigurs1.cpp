#include <signal.h>
#include <stdio.h>
#include <string.h>
#include <sys/types.h>
#include <unistd.h>

sig_atomic_t sigusr1_count = 0;

void handler (int sig)
{
    ++sig;
}
int main ()
{

    printf("PID: %i", (int) getpid());
    struct sigaction sa;
    memset(&sa, 0, sizeof(sa));
    sa.sa_handler = &handler;
    sigaction (SIGUSR1, &sa, NULL);
    sleep(15);

    printf("SIGUSR1 was raised %i times\n", sigusr1_count);
    return 0;
}
