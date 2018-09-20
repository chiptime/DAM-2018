#include <stdio.h>
#include <stdlib.h>
#include <getopt.h>


const char* program_name;

void print (FILE *stream, int TheExit)
{
    fprintf(stream,"Bienvenido a %s\n", program_name);
    fprintf(stream,
          "  Los productos disponibles son:\n"
          "  -f  --falafel         Falafel.\n"
          "  -h  --helado          Helado.\n"
          "  -l  --long-chicken    Long Chicken.\n"
          "  -c  --crispychicken   Crispy Chicken.\n\n"
          "  Para abrir la información: \n"
          "  -a  --ayuda           Ayuda\n");

    exit(TheExit);
}

int
main (int argc, char *argv[])
{
    int next_option;

    const char* const short_options = "ho:v";
    /* An array describing valid long options.  */
    const struct option long_options[] = {
                  { "falafel",       0, NULL, 'f' },
                  { "helado",        0, NULL, 'h' },
                  { "long-chicken",  0, NULL, 'l' },
                  { "crispychicken", 0, NULL, 'c' },
                  { "ayuda",         0, NULL, 'a' },
                  { NULL,            0, NULL,  0  }
    };
    program_name = argv[0];
//    fprintf(stdout,"Hey Bro\n",0);
    do
    {
        next_option = getopt_long (argc, argv, short_options, long_options, NULL);
        switch(next_option)
        {
            case 'a':
                fprintf(stdout," Has pedido un Ayuda.\n");
                print (stdout, 0);
                break;
            case 'f':
                fprintf(stdout," Has pedido un Falafel.\n");
                break;
            case 'h':
                fprintf(stdout," Has pedido un Helado.\n");
                break;
            case 'l':
                fprintf(stdout," Has pedido un Long Chicken.\n");
                break;
            case 'c':
                fprintf(stdout," Has pedido un Crispy Chicken.\n");
                break;
            case '?':
                print(stderr,1);
            case -1:
                break;
            default:
                abort();
        }

    }
    while(next_option != -1);
    return EXIT_SUCCESS;
}
