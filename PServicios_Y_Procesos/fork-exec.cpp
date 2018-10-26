#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int spawn (char *program, char **arg_list)
{
    pid_t child_pid;
    child_pid = fork();
    if(child_pid != 0)
        return child_pid;
    else{
        execvp(program, arg_list);

        fprintf (stderr, "an error ocurred in execvp\n");
        abort();
    }
}
int main()
{
    char *arg_list[] = {
        "ls",
        "-l",
        "/",
        NULL
    };
    int child_status;
    spawn("firefox", arg_list);
    wait(&child_status);
    if(WIFEXITED (child_status))
        printf("The child process exited normally, with exit code %i\n", WEXITSTATUS(child_status));
    else
        printf("The child process exited abnormally\n");
    printf("done with main program\n");
    return 0;
}
