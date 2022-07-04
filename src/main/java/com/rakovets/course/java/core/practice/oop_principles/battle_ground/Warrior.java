package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {

    Warrior(String name) {
        super(name);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(20);
    }
}
