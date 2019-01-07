CC = g++

.PHONY: clean

all: example

example: example.o sprite_render.o png.o
	$(CC) -o example $^ -lpng

%.o: %.cpp
	$(CC) -c $<

clean:
	$(RM) *.o
