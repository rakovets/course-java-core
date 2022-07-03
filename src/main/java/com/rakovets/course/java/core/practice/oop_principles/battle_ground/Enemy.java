package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    private int health;

    Enemy(int health) {
        this.health = health;
    }

    public void attackHero(Hero hero, int damage) {
        if (isAlive()) hero.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        if (isAlive()) this.health -= damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public int getHealth() {
        return this.health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

}
