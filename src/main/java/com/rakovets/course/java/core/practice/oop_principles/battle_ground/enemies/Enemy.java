package com.rakovets.course.java.core.practice.oop_principles.battle_ground.enemies;

import com.rakovets.course.java.core.practice.oop_principles.battle_ground.Mortal;
import com.rakovets.course.java.core.practice.oop_principles.battle_ground.heroes.Hero;

public abstract class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public Enemy(String name) {
        this.name = name;
    }

    public Enemy (String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
            this.health -= damage;
    }

    public abstract String attackHero(Hero hero);

    public abstract boolean isAlive();

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }


}
