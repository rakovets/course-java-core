package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(35);
        return "The " + getName() + " attacks the enemy";
    }

}
