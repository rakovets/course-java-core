package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
    final int DAMAGE_ARCHER_SHOT = 15;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        return enemy.takeDamage(DAMAGE_ARCHER_SHOT);
    }
}
