package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

import java.util.Arrays;

 class Archer extends Hero {

    int damage = 38;
    Archer(String name){
        super(name);

    }

     @Override
     public String attackEnemy(){
         Enemy unit = new Enemy(100);
         return "Mag is starting attack enemy units!!!\n Enemy got damages = " + unit.takeDamage(damage);
     }
}
