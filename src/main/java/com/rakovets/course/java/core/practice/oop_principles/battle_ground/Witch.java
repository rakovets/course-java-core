package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Witch extends Enemy {
    final int DAMAGE_WITCH_SPELL = 15;

    public Witch (int health) {
        super(health);
    }

    @Override
    public int attackHero(Hero hero) {
        return hero.takeDamage(DAMAGE_WITCH_SPELL);
    }
}
