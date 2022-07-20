package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Titan extends Enemy {
    public Titan(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void attackHero(Hero hero) {
        if (isAlive()) {
            hero.takeDamage(getDamage());
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
            regenPerHit(damage);
        }
    }

    public void regenPerHit(int damage) {
        setHealth(getHealth() + damage);
    }
}
