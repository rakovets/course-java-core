package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Vampire extends Enemy {
    public Vampire(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero, int damage) {
        if (isAlive()) {
            hero.takeDamage(damage);
            stealHealth(damage);
        } else {
            System.out.println("He is dead.");
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
        } else {
            System.out.println("He is dead");
        }
    }

    public void stealHealth(int damage) {
        setHealth(getHealth() + damage / (PERCENT_OF_HEALING*2));
    }
}
