package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Hero implements Mortal {

    protected String name;
    protected int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        health -= damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        System.out.printf("Hero is alive!\n");
        return health > 0;
    }
}
