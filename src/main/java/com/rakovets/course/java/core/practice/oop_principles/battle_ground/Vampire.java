package com.rakovets.course.java.core.practice.oop_principles.battle_groung;

public class Vampire extends Enemy{
    private final int DAMAGE_VAMPIRE = 25;

    public Vampire(int health) {
        super(health);
    }

    @Override
    public int attackHero(Hero hero) {
        return hero.takeDamage(DAMAGE_VAMPIRE);
    }
}
