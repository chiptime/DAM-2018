//
// Created by bruno on 17/06/18.
//

#ifndef BATTLECITY_BULLET_H
#define BATTLECITY_BULLET_H

#include "../global/global.h"


#ifdef __cplusplus
extern "C" {
#endif
void tankToBullet(struct Tanks atank, struct Bullets *bullet);
void printBullet(struct Bullets *position_Bullet, int checkDirection);
void crashBullet(Client *c);

#ifdef __cplusplus
}
#endif
#endif //BATTLECITY_BULLET_H
