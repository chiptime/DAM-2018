#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>

int main(){
  pid_t child;

  child = fork();
  if(child != 0 ){
      printf("Soy un padre %i y mi hijo es: %i", getpid(), child);
      wait(NULL);
  }else{
      printf("Soy un hijo: %i y mi padre es: %i", getpid(), getppid());
      execl("bin/echo", "echo", "Hello world", NULL);
  }
  return 0;
}
