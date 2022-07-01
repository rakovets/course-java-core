package com.rakovets.course.java.core.practice.oop_principles.Battle_Ground;

public class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public double takeDamage(int damage) {
        return this.health -= damage;
    }

    public double getHealth() {
        return this.health;
    }

    public void sethHealth(int health) {
        this.health = health;
    }
}
