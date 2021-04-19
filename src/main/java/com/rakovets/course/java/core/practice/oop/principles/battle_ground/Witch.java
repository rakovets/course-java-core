package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Witch extends Enemy {

    private final int TAKE_DAMAGE = 30;
    private final int SUPER_TAKE_DAMAGE = 50;

    protected Witch(int healthEnemy) {
        super(healthEnemy);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(TAKE_DAMAGE);
    }

    public void curseAttackHero(Hero hero) {
        hero.takeDamage(SUPER_TAKE_DAMAGE);
    }
}
