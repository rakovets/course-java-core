package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
        this.damage = 5;
    }

    public Mag(String name, int health) {
        super(name, health);
        this.damage = 5;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy instanceof Witch) {
            enemy.takeDamage(damage * INCREASE_POWER_FACTOR);
        } else {
            enemy.takeDamage(damage);
        }
    }
}
