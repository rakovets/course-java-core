package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mortal;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Hero;

public abstract class Enemy implements Mortal {
    private String name;
    private double health;

    public Enemy(double health) {
        this.health = health;
    }

    public Enemy(String name) {
        this.name = name;
    }

    public Enemy (String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(double damage) {
        if (isAlive()) {
            this.health -= damage;
        }
    }

    public abstract String attackHero(Hero hero);

    public abstract boolean isAlive();

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
