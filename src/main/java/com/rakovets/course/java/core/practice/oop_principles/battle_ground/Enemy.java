package com.rakovets.course.java.core.practice.oop_principles.battle_groung;

public abstract class Enemy implements Mortal{
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        if (isAlive()) {
            this.health -= damage;
        }
        return this.health;
    }

    public abstract int attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public int getHealth() {
        return this.health;
    }

    public int setHealth(int health) {
        return health;
    }
}
