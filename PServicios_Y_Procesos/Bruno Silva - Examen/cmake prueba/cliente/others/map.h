#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <sys/stat.h>

#define MAXSPR 	0x1000

#define BPP	4
#define SWIDTH  800
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
  {8, 8, {0x18, 0x3C, 0x7E, 0xDB, 0xFF, 0x5A, 0x81, 0x42}},
  {8, 8, {0x18, 0x3C, 0x7E, 0xDB, 0xFF, 0x24, 0x5A, 0xA5}}
};

int color (int x, int y);
void dump (int x, int y, struct Sprite s);
