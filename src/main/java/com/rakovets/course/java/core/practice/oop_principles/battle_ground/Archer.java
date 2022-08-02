package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
        setHealth(80);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        int default_damage = 14;
        enemy.takeDamage(default_damage);
        return "The " + getName() + " attacks the enemy";
    }

}
