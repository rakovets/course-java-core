package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        return "The " + getName() + " attacks the enemy";
    }

}
