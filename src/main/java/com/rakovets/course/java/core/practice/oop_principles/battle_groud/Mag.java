package com.rakovets.course.java.core.practice.oop_principles.battle_groud;

public class Mag extends Hero {
    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        final int PERCENT_FIRE = 20;
        final int PULSE_FIRE = 3;
        int damage = 100;

        for (int i = 1; i <= PULSE_FIRE; i++) {
            damage += (damage * PERCENT_FIRE) / 100;
        }

        System.out.println("Mage attacks!");
        return enemy.takeDamage(damage);
    }
}
