#include <stdio.h>
#include <stdlib.h>

extern char** environ;

int
main (int argcs, char *args[])
{
   char* port = getenv ("PORT");
   if (port == NULL)
      port = "4444";

   printf ("Conectando al puerto %s\n", port);
   /* Access the server here...  */
   return EXIT_SUCCESS;
}
