#include <stdio.h>
#include <stdlib.h>

int
main ()
{
    char c;
    while( (c =getchar())!='\n' && c !=EOF )
        printf("%c\n", c);

}
