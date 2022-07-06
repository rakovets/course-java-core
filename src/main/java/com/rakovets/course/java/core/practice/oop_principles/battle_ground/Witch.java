package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Witch extends Enemy {
    public Witch() {
        super();
        this.damage = 5;
    }

    public Witch(int health) {
        super(health);
        this.damage = 5;
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero instanceof Mag) {
            hero.takeDamage(damage * INCREASE_POWER_FACTOR);
        } else {
            hero.takeDamage(damage);
        }
    }
}
