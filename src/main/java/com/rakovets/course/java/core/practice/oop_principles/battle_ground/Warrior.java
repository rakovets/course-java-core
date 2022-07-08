package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    final int DAMAGE_WARRIOR_HIT = 20;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(DAMAGE_WARRIOR_HIT);
    }
}
