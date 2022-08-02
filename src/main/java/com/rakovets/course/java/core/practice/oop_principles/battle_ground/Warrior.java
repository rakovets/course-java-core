package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
        setHealth(150);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        int default_damage = 15;
        if(enemy.isAlive()) {
            enemy.takeDamage(default_damage);
        }
        return "The " + getName() + " attacks the enemy";
    }
}
