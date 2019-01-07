//
// Created by bruno on 17/06/18.
//

#include "teclas.h"



int teclas(struct Tanks *move, Bullets *position_Bullet, int arrow){
    int static checkDirection = 0;
    int static checkRIGHT = 0;
    int static checkLEFT = 0;
    int static checkUP = 0;
    int static checkDOWN = 0;
    int static lastKey = 0;
    if(arrow != -1)
        lastKey = arrow;
    switch(arrow){
        case KEY_UP:
            resetCheck(arrow, checkUP, checkLEFT, checkDOWN, checkRIGHT);
            if(direction(checkUP, checkLEFT, checkDOWN, checkRIGHT) == 1){
                (*move).position.y -= 5;
                if((*move).position.y < 45 )//((minf-1) ))//Up limit 9
                    (*move).position.y += 5;
            }
            maxCheck(arrow, checkUP, checkLEFT, checkDOWN, checkRIGHT);
            break;

        case KEY_LEFT:
            resetCheck(arrow, checkUP, checkLEFT, checkDOWN, checkRIGHT);
            if(direction(checkUP, checkLEFT, checkDOWN, checkRIGHT) == 2){
                (*move).position.x -= 5;
                if((*move).position.x < 45 )//Left limit 9
                    (*move).position.x += 5;
            }
            maxCheck(arrow, checkUP, checkLEFT, checkDOWN, checkRIGHT);
            break;

        case KEY_DOWN:
            resetCheck(arrow, checkUP, checkLEFT, checkDOWN, checkRIGHT);
            if(direction(checkUP, checkLEFT, checkDOWN, checkRIGHT) == 3){
                (*move).position.y += 5;
                if( (*move).position.y > 460 )// Down limit -15
                    (*move).position.y -= 5;
            }
            maxCheck(arrow, checkUP, checkLEFT, checkDOWN, checkRIGHT);
            break;

        case KEY_RIGHT:
            resetCheck(arrow, checkUP, checkLEFT, checkDOWN, checkRIGHT);
            if(direction(checkUP, checkLEFT, checkDOWN, checkRIGHT) == 4){
                (*move).position.x += 5;
                if( (*move).position.x > 670 )// Right limit -30
                    (*move).position.x -= 5;
            }
            maxCheck(arrow, checkUP, checkLEFT, checkDOWN, checkRIGHT);
            break;
        case 'b':
            checkDirection = direction(checkUP, checkLEFT, checkDOWN, checkRIGHT);
            tankToBullet(*move, position_Bullet);
            return checkDirection;
        case KEY_BREAK:
            return arrow;
        default:
            return checkDirection;
    }
checkDirection = direction(checkUP, checkLEFT, checkDOWN, checkRIGHT);
return checkDirection;
    refresh();
}
