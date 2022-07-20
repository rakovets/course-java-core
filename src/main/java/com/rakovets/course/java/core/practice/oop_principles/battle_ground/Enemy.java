package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    private int health;
    private int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public abstract void takeDamage(int damage);

    public abstract void attackHero(Hero hero);

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

    public int getDamage() {
        return damage;
    }
}
