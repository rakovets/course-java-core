package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Hero implements Mortal{
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.health = this.health + damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}
