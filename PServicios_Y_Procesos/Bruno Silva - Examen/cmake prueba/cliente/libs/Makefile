CC = g++
CFLAGS = -g -I../common/
VPATH=../common/

.PHONY: clean

all: example

example: example.o sprite_render.o png.o
	$(CC) $(CFLAGS) -o example $^ -lpng -lpthread -lz -luuid

%.o: %.cpp
	$(CC) $(CFLAGS) -c $<

clean:
	$(RM) *.o
