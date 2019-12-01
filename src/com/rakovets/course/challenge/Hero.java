package com.rakovets.course.challenge;

public abstract class Hero implements Mortal {

    String name;
    int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
