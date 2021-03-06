#include <malloc.h>
#include <pthread.h>
#include <semaphore.h>
#include <stdio.h>
#include <unistd.h>

sem_t sem;

void *say(void *parameter )
{

	sleep(2);
	printf("hola soy el hilo: %s\n", (char *)parameter);
	sleep(2);
	return NULL;
}

void inicializar()
{
	sem_wait(&sem);

	sem_post(&sem);

}

int 
main () 
{
	pthread_t thread1;
	pthread_t thread2;

	sem_init(&sem,0,0);
	pthread_create (&thread1, NULL, &say,(void *) "Hilo 1");
	pthread_create (&thread2, NULL, &say, (void *)"Hilo 2");

	pthread_join(thread1,NULL);
	pthread_join(thread2,NULL);

	printf("Los hilos han sido creados.\n");

	return 0;

}
