package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public abstract class Hero implements Mortal{
    private String name;
    private int health = 100;

    public Hero (String name) {
        this.name = name;
    }

    public Hero (String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public int getHealth() {
       return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
