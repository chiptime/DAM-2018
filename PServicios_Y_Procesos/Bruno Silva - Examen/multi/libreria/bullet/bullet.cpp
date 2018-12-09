//
// Created by bruno on 15/06/18.
//
#include "bullet.h"


void tankToBullet(struct Tanks atank, struct Bullets *bullet) {
    bullet->position.x = atank.position.x;
    bullet->position.y = atank.position.y;
}
void printBullet(struct Bullets *position_Bullet, int checkDirection) {

    DEBUG(40, 70, "La direccion a la que mira es %i", checkDirection);

    if (position_Bullet->position.x < 41 && position_Bullet->position.x > 0 && position_Bullet->position.y > 0 && position_Bullet->position.y < 26) {
        mvprintw((int) position_Bullet->position.y, (int) position_Bullet->position.x, "*");
        if (checkDirection == 1)
            position_Bullet->position.y--;

        if (checkDirection == 2)
            position_Bullet->position.x--;

        if (checkDirection == 3)
            position_Bullet->position.y++;

        if (checkDirection == 4)
            position_Bullet->position.x++;
    } else {
        mvprintw((int) position_Bullet->position.y, (int) position_Bullet->position.x, " ");
    }
    DEBUG(20, 60, "La posicion Y = %lf,La posicion X = %lf", position_Bullet->position.y, position_Bullet->position.x);
    refresh();
}
void crashBullet(Client *c){
    if(!c->tank[c->id].die){
        for(int r = 0; r<MAX_CLIENTS; r++)
            for(int col = 0; col < MAX_CLIENTS; col++)
                if(c->tank[r].position.x == c->tank[col].balas.position.x && c->tank[r].position.y == c->tank[col].balas.position.y ){
                    c->tank[r].position.x = 0;
                    c->tank[r].position.y = 0;
                    c->tank[r].die = 1;
                    c->tank[col].balas.position.x = 300;
                    c->tank[col].balas.position.y = 300;
                    c->tank[col].kills++;
                    break;
                }
    }else
        c->tank[c->id].die = 0;
}























/*


void printBullet(struct Tanks tbullet, struct Bullets *position){

    struct Bullets position_Bullet;

    mvprintw(position_Bullet.position.y,position_Bullet.position.y, "*");
    DEBUG(40,70, "La direccion a la que mira es %i",checkDirection);

    if(position_Bullet.position.x<40 && position_Bullet.position.x>1 && position_Bullet.position.y>1 && position_Bullet.position.y<25){
        if(checkDirection == 1)
            position->position.x--;

        if(checkDirection == 2)
            position->position.y--;

        if(checkDirection == 3)
            position->position.y++;

        if(checkDirection == 4)
            position->position.x++;
    }
    else{
        mvprintw(position_Bullet.position.y,position_Bullet.position.x, " ");
    }
    DEBUG(20,60,"La posicion Y = %lf,La posicion X = %lf",position_Bullet.position.y,position_Bullet.position.x);
    refresh();
}
 */
