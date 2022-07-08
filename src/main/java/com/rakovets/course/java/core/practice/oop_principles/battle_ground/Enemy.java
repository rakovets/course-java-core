package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    protected static final int INCREASE_POWER_FACTOR = 2;
    protected int damage;
    private int health;

    public Enemy() {
        this.health = 100;
        this.damage = 5;
    }

    public Enemy(int health) {
        this.health = health;
        this.damage = 5;
    }

    public int getDamage() {
        return damage;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void takeDamage(int damage, Hero hero) {
        this.health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackHero(Hero hero);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
