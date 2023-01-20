package com.rakovets.course.java.core.practice.oop_principles.battle_Ground;

public class Vampire extends Enemy {
    public Vampire(int health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(5);
    }

    @Override
    public void skillEnemy(Hero hero) {
        final int drainHP = 10;
        if (this.getHealth() > 30 && this.getHealth() < 35) {
            setHealth(getHealth() + drainHP);
        }
    }
}
