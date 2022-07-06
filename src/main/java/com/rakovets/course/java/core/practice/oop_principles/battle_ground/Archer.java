package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
    protected final double DAMAGE_ARCHER = 15;

    public Archer(String name, double health) {
        super(name, health);
    }

    @Override
    public double attackEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            enemy.takeDamage(DAMAGE_ARCHER);
        }
        return enemy.getHealth();
    }
}
