package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    private int health;

    public final int PERCENT_OF_HEALING = 10;

    public Enemy(int health) {
        this.health = health;
    }

    public abstract void takeDamage(int damage);

    public abstract void attackHero(Hero hero, int damage);

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
