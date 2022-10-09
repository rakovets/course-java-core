package com.rakovets.course.java.core.practice.oop_principles;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    {
        health = 200;
    }

    Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void attackEnemy();

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth(){
        return health;
    }
    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return (health > 0);
    }
}
