package com.rakovets.course.java.core.practice.oop_principles.battle_groung;

public class Mag extends Hero {
    protected final int DAMAGE_MUG = 50;

    public Mag(String name, int health) {
        super(name, health);
    }

    public int attackEnemy(Enemy enemy) {
        if(enemy.isAlive()) {
            enemy.takeDamage(DAMAGE_MUG);
        }
        return enemy.getHealth();
    }
}
