#include "map.h"

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
/*
int
main (int argc, char *argv[])
{
  int fd;

  fd = open ("/dev/fb0", O_RDWR | O_CREAT, S_IRUSR | S_IWUSR);
  fmap =
    (int *) mmap (0, LENGTH * BPP, PROT_READ | PROT_WRITE, MAP_SHARED, fd, 0);

  int inc = 20;
  for (int fila = 0; fila < SHEIGHT - inc; fila += inc)
    for (int col = 0; col < SWIDTH - inc; col += 2 * inc)
      {
	dump (col, fila, alien[0]);
	dump (col + inc, fila, alien[1]);
      }

  munmap (fmap, LENGTH * BPP);
  close (fd);

  return EXIT_SUCCESS;
}*/
