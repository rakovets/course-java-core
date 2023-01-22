package com.rakovets.course.java.core.practice.oop_principles.battle_groung;

public class Archer extends Hero {
    protected final int DAMAGE_ARCHER = 20;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        if(enemy.isAlive()) {
            enemy.takeDamage(DAMAGE_ARCHER);
        }
        return enemy.getHealth();
    }
}
