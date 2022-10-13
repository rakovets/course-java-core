package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private boolean isAlive;

    public Hero(String name, int health, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
    }

    public abstract void attackEnemy(Enemy enemy);

    public boolean isAlive(int health) {
        isAlive = (getHealth() > 0) ? true : false;
        return isAlive;
    }

    public void takeDamage(int damage) {
        health = getHealth() - damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }
}
