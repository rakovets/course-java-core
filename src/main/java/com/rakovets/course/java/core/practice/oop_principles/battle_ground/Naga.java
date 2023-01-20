package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Naga extends Enemy {
    public Naga(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 15;
        hero.takeDamage(damage);
    }

    public void drinkBlood(Hero hero) {
        int damage = 25;
        int regeneration = 25;
        hero.takeDamage(damage);
        setHealth(getHealth() + regeneration);
    }
}
