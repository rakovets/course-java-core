package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
    Archer (String name) {
        super(name);
    }
    @Override
    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(12);
    }
}
