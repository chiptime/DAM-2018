cmake_minimum_required(VERSION 3.9)
project(server)

set(CMAKE_CXX_STANDARD 17)

add_executable(server server.cpp ../libreria/mapa/mapa.h ../libreria/ncurses/ncurses.cpp ../libreria/ncurses/ncurses.h ../libreria/mapa/mapa.cpp ../libreria/tank/tank.cpp ../libreria/tank/tank.h ../libreria/global/global.h ../libreria/global/global.cpp ../libreria/bullet/bullet.cpp ../libreria/bullet/bullet.h ../libreria/teclas/teclas.cpp ../libreria/teclas/teclas.h )



target_link_libraries(server ncursesw)
