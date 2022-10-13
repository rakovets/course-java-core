package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    private int health;
    private boolean isAlive;

    public Enemy(int health, boolean isAlive) {
        this.health = health;
        this.isAlive = isAlive;
    }

    public abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        boolean alive;
        alive = (getHealth() > 0) ? true : false;
        return alive;
    }

    public void takeDamage(int damage) {
        health = this.health - damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
