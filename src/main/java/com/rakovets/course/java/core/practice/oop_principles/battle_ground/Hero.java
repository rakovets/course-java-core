package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero implements Mortal {
    protected final int INCREASE_POWER_FACTOR = 2;
    private final String name;
    protected int damage;
    private int health;

    public Hero(String name) {
        this.name = name;
        this.health = 100;
        this.damage = 5;
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
        this.damage = 5;
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


    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}
