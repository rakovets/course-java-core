package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    private int health;
    boolean isAlive;


    public Enemy(int health, boolean isAlive) {
        this.health = health;
        this.isAlive = isAlive;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
