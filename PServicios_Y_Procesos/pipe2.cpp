#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

void writer (const char* message, int count, FILE* stream)
{
    for (; count > 0; --count){
    fprintf (stream, "%s\n", message);
    fflush (stream);
//    sleep (1);
    }
}

void reader (FILE* stream)
{
    char buffer[1024];

    while (!feof (stream) && !ferror (stream) && fgets (buffer, sizeof(buffer), stream ) != NULL)
        fputs (buffer, stdout);
}

int main ()
{
    int fds[2];
    pid_t pid;
    char* palabras;

    pipe (fds);

    pid = fork ();
    if(pid == (pid_t) 0){
        close (fds[1]);
        dup2 (fds[0], STDIN_FILENO);
        execlp ("./printChars", "printfChars", 0);
    }
    else{
        FILE* stream;
        palabras = (char*) malloc (sizeof(palabras) + 1);
        scanf("%s", palabras);
        close (fds[0]);
        stream = fdopen (fds[1], "w");
        writer (palabras, 1, stream);
        close (fds[1]);
        waitpid (pid, 0,0);
    }
    return 0;
}

