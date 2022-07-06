package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero{
    protected final double DAMAGE_MAG = 10;

    public Mag(String name, double health) {
        super(name, health);
    }

    @Override
    public double attackEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            enemy.takeDamage(DAMAGE_MAG);
        }
        return enemy.getHealth();
    }
}
