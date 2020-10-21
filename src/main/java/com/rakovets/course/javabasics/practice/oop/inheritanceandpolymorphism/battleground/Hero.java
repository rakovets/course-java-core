package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public abstract class Hero {

    public String name;
    public int health;

    Hero(String newName) {
        name = newName;
    }

    public int takeDamage(int damage) {
        return health = health - damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    abstract void attackEnemy(Enemy unit);

    public boolean isAlive() {
        return health > 0;
    }


}
