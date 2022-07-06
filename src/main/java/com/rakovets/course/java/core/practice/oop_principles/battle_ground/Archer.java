package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
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
            int attackAmplificationFactor = 2;
            enemy.takeDamage(damage * attackAmplificationFactor);
        } else {
            enemy.takeDamage(damage);
        }
    }
}
