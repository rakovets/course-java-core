package com.rakovets.course.java.core.practice.oop_principles.battle_groud;

public class Ghoul extends Enemy {
    public Ghoul(int health) {
        super(health);
    }

    public int attackHero(Hero hero) {
        final int POISONING_PERCENT = 85;

        int damage = 95;
        damage += (damage * POISONING_PERCENT) / 100;

        return hero.takeDamage(damage);
    }
}
