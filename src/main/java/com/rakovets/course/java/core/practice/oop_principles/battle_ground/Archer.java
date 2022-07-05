package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
    private final int ATTACK_AMPLIFICATION_FACTOR=2;

    public Archer(String name) {
        super(name);
        this.damage = 5;
    }

    public Archer(String name, int health) {
        super(name, health);
        this.damage = 5;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (getHealth() > 50) {
            enemy.takeDamage(damage * ATTACK_AMPLIFICATION_FACTOR);
        } else {
            enemy.takeDamage(damage);
        }
    }
}
