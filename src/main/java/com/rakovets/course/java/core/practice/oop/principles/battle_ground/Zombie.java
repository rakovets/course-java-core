package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Zombie extends Enemy {
    private final int DAMAGE = 2;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Hero hero) {
        hero.takeDamage(DAMAGE);
    }

    public void poison(Hero hero) {
        hero.takeDamage(10 + DAMAGE);
    }
}
