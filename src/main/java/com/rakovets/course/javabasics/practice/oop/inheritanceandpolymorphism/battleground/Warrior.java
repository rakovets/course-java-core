package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

class Warrior extends Hero {

    private int damage = 58;
    Warrior(String newName) {
        super(newName);
    }
@Override
    public String attackEnemy(){
    Enemy unit = new Enemy(100);
   return "Warrior " + super.getName() + " is starting attack enemy units!!!\n" + ANSI_RED + "Enemy got damages = " + unit.takeDamage(damage) + ANSI_RESET;
    }
}
