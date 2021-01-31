package com.rakovets.course.java.core.practice.oop.principles;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (!isAlive()) {
            this.health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public void attackHero(Hero hero) {
        hero.takeDamageHero(10);
    }

}
