package com.rakovets.course.java.core.practice.oop_principles.battle_groud;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        final int CRITICAL_ARROW = 3;
        int damage = 60;

        return enemy.takeDamage(damage * CRITICAL_ARROW);
    }
}
