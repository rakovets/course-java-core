package com.rakovets.course.java.core.practice.oop_principles.battle_groung;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public abstract int attackEnemy(Enemy enemy);

    public int takeDamage(int damage) {
        if (isAlive()) {
            this.health -= damage;
        }
        return this.health;
    }

    public String getName() {
        return this.name;
    }
}
