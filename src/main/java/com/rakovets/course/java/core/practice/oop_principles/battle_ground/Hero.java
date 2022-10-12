package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

abstract public class Hero {
    private String name;
    private double health;
    public Hero(String name, double health) {
        this.health = health;
        this.name = name;
    }
    public Hero() {
    }
    public void takeDamage(double damage) {
        health -= damage;
    }
    public abstract void attackEnemy(Enemy enemy);
    public String getName() {
        return name;
    }
    public double getHealth() {
        return health;
    }
}
