package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Enemy implements Mortal{
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
