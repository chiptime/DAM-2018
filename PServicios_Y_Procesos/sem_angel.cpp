#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#include <semaphore.h>
#include <signal.h>
#include <stdint.h>
#include <sys/time.h>


#define N 14
#define Nplays 4

pthread_mutex_t mutex;
sig_atomic_t a_cenar = 0;
sig_atomic_t plays_usadas = 0;
sem_t txemaforo;

pthread_mutex_t job_queue_mutex = PTHREAD_MUTEX_INITIALIZER;

void inicializar(int n_plays)
{
	sem_init(&txemaforo, 0, n_plays);
}

void *say(void* param)
{
	while(! a_cenar){
		sem_wait(&txemaforo);
		plays_usadas++;
		sleep(rand() % 3 +1);
		plays_usadas--;
		sem_post(&txemaforo);
		sleep(rand() % 30 +1);
	}
}

int
main (int argc, char *argv[])
{
	pthread_t nino[N];
	int count   = 200;

	srand(time(NULL));
	inicializar(Nplays);
	for (int i=0; i < N; i++)
		pthread_create(&nino[i], NULL, &say, (void *) NULL);

	while(count){
		printf("Usadas: %i                          \r",
			plays_usadas);
		fflush(stdout);
		usleep(500000);
		count--;
	}
	a_cenar=1;

	for (int i=0; i<N; i++)
		pthread_join(nino[i], NULL);
	sem_destroy(&txemaforo);
}
