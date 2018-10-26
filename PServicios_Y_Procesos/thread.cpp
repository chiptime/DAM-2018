#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#define N 2
void *
imprime (void *x)
{
	for(int i=0;i<1000;i++)
		fputc(stderr, *((char *)x));
	return NULL;
}

int
main (int argc, char *args[])
{
	char params[N] ={ 'x', 'o'};

	pthread_t mi_hijo[N];
	for(int i=0; i<N;i++)
		pthread_create(mi_hijo[N], NULL, (&imprime, (void *) &params[N]));

	for(int i=0; i<N;i++)
		pthread_join(mi_hijo[N],NULL);

	return 0;
}
