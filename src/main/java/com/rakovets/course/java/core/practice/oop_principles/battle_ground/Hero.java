package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Hero {
    public final int DEFAULT_DAMAGE = 10;
    private final String name;


    public Hero(String name) {
        this.name = name;
    }

    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(DEFAULT_DAMAGE);
        return "The " + name + " attacks the enemy";
    }

    public String getName() {
        return name;
    }
}
