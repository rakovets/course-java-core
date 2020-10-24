package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

interface Mortal {
     default boolean  isAlive(int health){
          return health > 0;
     }
}
