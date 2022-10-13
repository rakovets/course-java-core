package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Vampire extends Enemy {
    public Vampire(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(25);
    }

    public void drinkBlood(Hero hero) {
        hero.takeDamage(10);
        this.setHealth(this.getHealth() + 10);
    }
}
