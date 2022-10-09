package com.rakovets.course.java.core.practice.oop_principles.battle_groud;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
        }
        return getHealth();
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }

    public int attackHero(Hero hero) {
        return attackHero(hero);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
