package com.rakovets.course.java.core.practice.oop_principles.battle_groud;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        final int PERCENT_BLEEDING_MAX = 30;
        final int PERCENT_BLEEDING_MIN = 15;
        final int PULSE_BLEEDING = 5;

        int numberPulseBleeding = PERCENT_BLEEDING_MAX;
        int damage = 90;

        while (numberPulseBleeding > PERCENT_BLEEDING_MIN) {
            damage += (damage * numberPulseBleeding) / 100;
            numberPulseBleeding -= PULSE_BLEEDING;
        }

        System.out.println("Warrior attacks!");
        return enemy.takeDamage(damage);
    }
}
