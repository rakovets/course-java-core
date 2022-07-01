package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Titan extends Enemy {
    public Titan(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero, int damage) {
        if (isAlive()) {
            hero.takeDamage(damage);
        } else {
            System.out.println("He is dead.");
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
            regenPerHit(damage);
        } else {
            System.out.println("He is dead.");
        }
    }

    public void regenPerHit(int damage) {
        setHealth(getHealth() + damage / PERCENT_OF_HEALING);
    }
}
