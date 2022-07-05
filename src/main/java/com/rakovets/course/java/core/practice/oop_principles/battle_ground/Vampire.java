package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Vampire extends Enemy {
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
            hero.takeDamage(damage * 2);
        }
        int vampireHealthIncreaseFactor = 5;
        this.setHealth(getHealth() + vampireHealthIncreaseFactor);
    }
}
