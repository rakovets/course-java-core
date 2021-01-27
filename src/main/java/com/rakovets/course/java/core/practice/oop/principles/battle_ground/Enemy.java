package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int healthUpdate) {
        this.health = healthUpdate;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public void attackHero(Hero hero) {
        if (this.isAlive()) {
            hero.takeDamage(5);
        }
    }
}
