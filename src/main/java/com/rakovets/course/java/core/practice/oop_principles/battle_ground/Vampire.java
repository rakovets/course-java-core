package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Vampire extends Enemy {
    private static final int VAMPIRE_HEALTH_INCREASE_FACTOR = 5;

    public Vampire() {
        super();
        this.damage = 5;
    }

    public Vampire(int health) {
        super(health);
        this.damage = 5;
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero instanceof Mag) {
            hero.takeDamage(damage);
        } else {
            hero.takeDamage(damage * INCREASE_POWER_FACTOR);
        }
        this.setHealth(getHealth() + VAMPIRE_HEALTH_INCREASE_FACTOR);
    }
}
