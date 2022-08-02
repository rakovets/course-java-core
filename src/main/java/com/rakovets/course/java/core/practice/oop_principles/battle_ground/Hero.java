package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Hero {
    private final String name;


    public Hero(String name) {
        this.name = name;
    }

    public String attackEnemy(Enemy enemy) {
        int default_damage = 10;
        enemy.takeDamage(default_damage);
        return "The " + name + " attacks the enemy";
    }

    public String getName() {
        return name;
    }
}
