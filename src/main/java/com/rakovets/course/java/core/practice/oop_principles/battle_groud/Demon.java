package com.rakovets.course.java.core.practice.oop_principles.battle_groud;

public class Demon extends Enemy {
    public Demon(int health) {
        super(health);
    }

    @Override
    public int attackHero(Hero hero) {
        final int CURSE_EFFECT_PERCENT = 10;
        final int NUMBER_CURS_EFFECT = 6;

        int damage = 110;

        for (int i = 1; i < NUMBER_CURS_EFFECT; i++) {
            damage += (damage * CURSE_EFFECT_PERCENT) / 100;
        }

        return hero.takeDamage(damage);
    }
}
