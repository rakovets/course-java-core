package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    Mag (String name) {
        super(name);
    }
    @Override
    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(25);
    }
}
