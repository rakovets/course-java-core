package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Witch extends Enemy {
    public Witch(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(5);
    }

    public void takeDamage(int damage, Hero hero) {
        super.takeDamage(damage);
        if (!isAlive()) {
            hero.takeDamage(30);
        }
    }
}
