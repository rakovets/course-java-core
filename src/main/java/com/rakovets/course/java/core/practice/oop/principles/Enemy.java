package com.rakovets.course.java.core.practice.oop.principles;

public class Enemy implements Mortal {
    private double health;

    public Enemy(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attackHero(Hero hero) {
         hero.takeDamage(20);
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        }
        return false;
    }

}
