package com.rakovets.course.java.core.practice.oop_principles.battle_Ground;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public boolean isAlive() {
        return (health > 0);
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void skillHero(Enemy enemy);

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }
}
