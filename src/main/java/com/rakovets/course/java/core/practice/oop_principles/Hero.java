package com.rakovets.course.java.core.practice.oop_principles;

public abstract class Hero implements Mortal {
    final  int DAMAGE_FROM_HERO = 5;

    private String name;
    private int health;

    Hero(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return (health > 0);
    }

    public abstract String attackEnemy();

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE_FROM_HERO);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public String getName() {
        return this.name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
