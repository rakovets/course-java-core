package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public abstract class Enemy implements Mortal, TakeDamage {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void attackHero(Hero hero);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
