package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        return this.health -= damage;
    }

    public int getHealth() {
        return this.health;
    }

    public void sethHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackHero(Hero hero);
}
