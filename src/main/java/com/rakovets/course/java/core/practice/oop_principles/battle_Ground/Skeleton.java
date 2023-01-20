package com.rakovets.course.java.core.practice.oop_principles.battle_Ground;

public class Skeleton extends Enemy {
    public Skeleton(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(4);
    }

    @Override
    public void skillEnemy(Hero hero) {
        final int fullRestoreHealth = 100;
        if (this.getHealth() == 0) {
            this.setHealth(fullRestoreHealth);
        }
    }
}
