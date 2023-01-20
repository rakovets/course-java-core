package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Naga extends Enemy {
    public Naga(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 10;
        hero.takeDamage(damage);
    }

    public void drinkBlood(Hero hero) {
        int damage = 20;
        int regeneration = 10;
        hero.takeDamage(damage);
        setHealth(getHealth() + regeneration);
    }
}
