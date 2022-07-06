package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class HellHound extends Enemy{
    protected final double DAMAGE_HELL_HOUND = 10;

    public HellHound(double health) {
        super(health);
    }

    @Override
    public double attackHero(Hero hero) {
       return hero.takeDamage(DAMAGE_HELL_HOUND);
    }
}
