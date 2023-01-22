package com.rakovets.course.java.core.practice.oop_principles.battle_groung;

public class Witch extends Enemy {
    protected final int DAMAGE_WITCH = 35;

    public Witch(int health) {
        super(health);
    }

    @Override
    public int attackHero(Hero hero) {
        return hero.takeDamage(DAMAGE_WITCH);
    }
}
