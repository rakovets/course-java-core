package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public abstract class Hero implements Mortal {

    public final String name;
    public int health;

    public Hero(String newName) {
        name = newName;
    }

    public int takeDamage(int damage) {
        return health = health - damage;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    abstract void attackEnemy(Enemy unit);


}
