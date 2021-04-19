package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Zombie extends Enemy {

    private final int TAKE_DAMAGE = 20;
    private final int SUPER_TAKE_DAMAGE = 40;

    protected Zombie(int healthEnemy) {
        super(healthEnemy);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(TAKE_DAMAGE);
    }

    public void spitAttackHero(Hero hero) {
        hero.takeDamage(SUPER_TAKE_DAMAGE);
    }
}
