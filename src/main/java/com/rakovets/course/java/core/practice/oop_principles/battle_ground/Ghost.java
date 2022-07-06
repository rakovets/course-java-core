package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Ghost extends Enemy {
    protected final double DAMAGE_GHOST = 15;

    public Ghost(double health) {
        super(health);
    }

    @Override
    public double attackHero(Hero hero) {
        return hero.takeDamage(DAMAGE_GHOST);
    }
}
