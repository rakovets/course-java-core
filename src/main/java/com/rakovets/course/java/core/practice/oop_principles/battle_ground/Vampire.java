package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Vampire extends Enemy {
    public Vampire(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void attackHero(Hero hero) {
        if (isAlive()) {
            hero.takeDamage(getDamage());
            stealHealth(getDamage());
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
        }
    }

    public void stealHealth(int damage) {
        setHealth(getHealth() + damage);
    }
}
