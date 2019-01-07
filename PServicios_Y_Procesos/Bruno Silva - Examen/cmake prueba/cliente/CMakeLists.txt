cmake_minimum_required(VERSION 3.9)
project(example)

set(CMAKE_CXX_STANDARD 17)

add_executable(example example.cpp ../libreria/framebuffer/png.h ../libreria/framebuffer/png.cpp ../libreria/framebuffer/sprite_render.h ../libreria/framebuffer/sprite_render.cpp)

target_link_libraries(example png)
