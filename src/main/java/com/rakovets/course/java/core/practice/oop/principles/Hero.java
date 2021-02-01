package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Hero implements Mortal {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public abstract void attackEnemy();

    public abstract void attackEnemy(Enemy enemy);

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

}
