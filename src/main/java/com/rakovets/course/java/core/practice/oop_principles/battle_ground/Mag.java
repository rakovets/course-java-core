package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {

    public Mag(String name) {
        super(name);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        int default_damage = 12;
        enemy.takeDamage(default_damage);
        return "The " + getName() + " attacks the enemy";
    }

}
