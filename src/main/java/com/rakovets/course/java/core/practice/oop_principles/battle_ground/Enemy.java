package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
