package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    protected final int DAMAGE_WARRIOR = 30;

    public Warrior(String name, int health) {
        super(name,health);
    }

    public int attackEnemy(Enemy enemy) {
        if(enemy.isAlive()) {
            enemy.takeDamage(DAMAGE_WARRIOR);
        }
        return enemy.getHealth();
    }
}
