package com.rakovets.course.java.core.practice.oop_principles;

public class Enemy {
    private int health;

    Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void setHealth (int health) {
        this.health = health;
    }

    public int getHealth () {
        return health;
    }
}
