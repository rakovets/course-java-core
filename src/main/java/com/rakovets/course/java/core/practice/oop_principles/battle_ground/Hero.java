package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero {
    private String name;
    private int health;

    public Hero() {
    }

    public Hero(String name, int health) {
        this.health = health;
        this.name = name;
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
}
