package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Enemy implements Mortal{
    private int health;

    Enemy(int health) {
        this.health = health;
    }
    int getHealth() {
        return this.health;
    }
    void setHealth() {
        this.health = health;
    }
    void takeDamage(int damage) {
        this.health -= damage;
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
