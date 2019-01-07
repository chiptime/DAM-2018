#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <sys/stat.h>

#define MAXSPR 	0x1000

#define BPP	4
#define SWIDTH  600
#define SHEIGHT 600
#define LENGTH  ( SWIDTH * SHEIGHT )

#define BLACK 0x00000000
#define WHITE 0x00FFFFFF	/* format Alpha, Blue, Green, Red */


struct Sprite
{
  int width;
  int height;
  unsigned char data[0x1000];
};

int *fmap;
static struct Sprite alien[] = {
  {8, 8, {0x3C, 0x3C, 0x3C, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF}} //0xFF,  0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF}}
};

int
color (int x, int y)
{
  int r = 0xFF;
  int g = 0x00;
  int b = 0xFF;

  r = (int) r * ((double) x / SWIDTH);
  b = (int) b * ((double) y / SHEIGHT);
  return r + (g << 8) + (b << 16);
}

void
dump (int x, int y, struct Sprite s)
{
  for (int fila = 0; fila < s.height; fila++)
    for (int col = 0; col < s.width; col++)
      fmap[(y + fila) * SWIDTH + x + col] =
	(s.data[fila] & (1 << col)) ? color (x, y) : BLACK;
}

int
main (int argc, char *argv[])
{
  int fd;

  fd = open ("/dev/fb0", O_RDWR | O_CREAT, S_IRUSR | S_IWUSR);
  fmap =
    (int *) mmap (0, LENGTH * BPP, PROT_READ | PROT_WRITE, MAP_SHARED, fd, 0);


  for(int f = 0; f < SHEIGHT-38; f++)
    for(int c = 0; c < SWIDTH; c++)
        if(f > 100 && f < 400 && c < 100)// && c < 100)
        fmap[f * SWIDTH + c] = WHITE;
  //int inc = 20;
 // dump (50, 50, alien[0]);

//  for (int fila = 0; fila < SHEIGHT - inc; fila += inc)
  //  for (int col = 0; col < SWIDTH - inc; col += 2 * inc)
    //  {

//	dump (fila, col, alien[0]);
      //}

  sleep(2);
  munmap (fmap, LENGTH * BPP);
  close (fd);

  return EXIT_SUCCESS;
}

