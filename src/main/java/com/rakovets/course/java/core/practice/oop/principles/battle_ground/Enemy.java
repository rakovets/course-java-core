package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        return health -= damage;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
