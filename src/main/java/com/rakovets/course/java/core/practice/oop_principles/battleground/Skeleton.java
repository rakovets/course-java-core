package com.rakovets.course.java.core.practice.oop_principles.battleground;

public class Skeleton extends Enemy{
    public Skeleton (int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        final int SKELETON_DAMAGE = 15;
        hero.takeDamage(SKELETON_DAMAGE);
    }

    public void absorbHealth(Hero hero) {
        final int ABSORB_VALUE = 10;
        hero.takeDamage(ABSORB_VALUE);
        setHealth(getHealth() + ABSORB_VALUE);
    }
}
