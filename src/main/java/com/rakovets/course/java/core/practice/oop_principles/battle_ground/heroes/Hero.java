package com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies.Enemy;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mortal;

public abstract class Hero implements Mortal {
    private String name;
    private double health;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(double health) {
        this.health = health;
    }

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public abstract String attackEnemy(Enemy enemy);

    public void takeDamage(double damage) {
        if (isAlive()) {
            this.health -= damage;
        }
    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }

    public String getName() {
        return name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }
}
