package com.rakovets.course.java.core.practice.oop.principles;

public class Bandit extends Enemy {

    protected Bandit(int healthEnemy) {
        super(healthEnemy);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(30);
    }

    public void axeAttackHero(Hero hero) {
        hero.takeDamage(50);
    }
}
