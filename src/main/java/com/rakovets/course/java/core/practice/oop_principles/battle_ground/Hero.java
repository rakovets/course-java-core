package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero {
    private final String name;
    private int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy, int damage);

    public void takeDamage(int damage) {
        if (isAlive()) this.health -= damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }
}
