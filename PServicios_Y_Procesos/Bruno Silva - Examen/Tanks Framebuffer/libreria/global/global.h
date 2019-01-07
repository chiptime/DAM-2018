//
// Created by bruno on 14/06/18.
//

#ifndef BATTLECITY_GLOBAL_H
#define BATTLECITY_GLOBAL_H

#include <ncurses.h>
#include "global.cpp"
#include "../framebuffer/sprite_render.h"
#define MAX_CLIENTS 3

#ifdef __cplusplus
extern "C" {
#endif



//DEBUGING
#ifndef NODEBUG
#define DEBUG(...) mvprintw(__VA_ARGS__)
#else
#define DEBUG(...)
#endif

struct Position{
    double x;
    double y;
};
struct Block {
    struct Position position;
    bool unbreakable;
};
struct Bullets {
    struct Position position;
    double dir ;
    int alive = 0;
};
struct Tanks {
    Sprite sprite;
    struct Position position;
    struct Position whereDied;
    struct Bullets balas;
    int kills = 0;
    int die;
    bool ia;
    int dir;
};
struct Client {
    struct Tanks tank[MAX_CLIENTS];
    int count = 0;
    int id;
};




#ifdef __cplusplus
}
#endif

#endif //BATTLECITY_GLOBAL_H
