package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero{
    protected final double DAMAGE_WARRIOR = 5;
    public Warrior(String name, double health) {
        super(name, health);
    }


    @Override
    public double attackEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            enemy.takeDamage(DAMAGE_WARRIOR);
        }
        return enemy.getHealth();
    }
}
