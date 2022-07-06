package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero implements Mortal {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public abstract double attackEnemy(Enemy enemy);

    public double takeDamage(double damage) {
        if (isAlive()) {
        this.health -= damage;}
        return this.health;
    }

    public String getName() {
        return this.name;
    }
}
