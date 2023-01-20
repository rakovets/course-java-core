package com.rakovets.course.java.core.practice.oop_principles.battle_Ground;

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

    public int setHealth(int health) {
        this.health = health;
        return health;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attackHero(Hero hero);

    public abstract void skillEnemy(Hero hero);

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
