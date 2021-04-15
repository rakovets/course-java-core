package com.rakovets.course.java.core.practice.oop.principles;

public class Dragon extends Enemy {

    protected Dragon(int healthEnemy) {
        super(healthEnemy);
    }

    @Override
    public void takeDamage(int damage) {
        healthEnemy -= (damage / 2);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(50);
    }
    public void fireAttackHero(Hero hero) {
        hero.takeDamage(90);
    }
}
