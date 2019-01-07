CC = g++

.PHONY: clean

all: client

client: client.o bullet.o global.o mapa.o ncurses.o tank.o teclas.o png.o sprite_render.o
	$(CC) -o client $^ -lncursesw -lpng

%.o: %.cpp
	$(CC) -c $<
client.o: client.cpp
	$(CC) -c $<
bullet.o: ../libreria/bullet/bullet.cpp
	$(CC) -c $<
global.o: ../libreria/global/global.cpp
	$(CC) -c $<
mapa.o: ../libreria/mapa/mapa.cpp
	$(CC) -c $<
ncurses.o: ../libreria/ncurses/ncurses.cpp
	$(CC) -c $<
tank.o: ../libreria/tank/tank.cpp
	$(CC) -c $<
teclas.o: ../libreria/teclas/teclas.cpp
	$(CC) -c $<
png.o: ../libreria/framebuffer/png.cpp
	$(CC) -c $<
sprite_render.o: ../libreria/framebuffer/sprite_render.cpp
	$(CC) -c $<

clean:
	$(RM) *.o
