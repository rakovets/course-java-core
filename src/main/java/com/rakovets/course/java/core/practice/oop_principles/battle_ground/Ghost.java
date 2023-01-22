package com.rakovets.course.java.core.practice.oop_principles.battle_groung;

public class Ghost extends Witch {
    protected final int DAMAGE_GHOST = 20;

    public Ghost(int health) {
        super(health);
    }

    @Override
    public int attackHero(Hero hero) {
        return hero.takeDamage(DAMAGE_GHOST);
    }

}
