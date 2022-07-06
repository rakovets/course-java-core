package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Skeleton extends Enemy{
    protected final double DAMAGE_SKELETON = 5;

    public Skeleton(double health) {
        super(health);
    }

    @Override
    public double attackHero(Hero hero) {
        return hero.takeDamage(DAMAGE_SKELETON);
    }


}
