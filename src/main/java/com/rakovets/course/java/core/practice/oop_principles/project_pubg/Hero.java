package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero() {
    }

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return  name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
