package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int maxHealth;
    private int damage;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void takeDamage(int damage);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getDamage() {
        return damage;
    }
}
