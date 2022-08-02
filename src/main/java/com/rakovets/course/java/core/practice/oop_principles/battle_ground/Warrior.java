package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);

    }

    @Override
    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(30);
        return "The " + getName() + " attacks the enemy";
    }
}
