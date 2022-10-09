package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class EnemySkeleton extends Enemy {
    private final int DAMAGE_SKELETON = 25;
    private final int DAMAGE_MULTIPLAYER = 2;

    public EnemySkeleton(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(DAMAGE_SKELETON);
    }

    public void attackHeroIncreased(Hero hero) {
        hero.takeDamage(DAMAGE_SKELETON * DAMAGE_MULTIPLAYER);
    }
}
