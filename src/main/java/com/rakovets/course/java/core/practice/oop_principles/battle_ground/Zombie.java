package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import java.util.Random;

public class Zombie extends Enemy {
    private int maxHealth;

    public Zombie(int health, int damage) {
        super(health, damage);
        this.maxHealth = health;
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
            reincarnation();
        }
    }

    public void reincarnation() {
        if (!isAlive()) {
            if (booleanRand()) {
                setHealth(maxHealth);
            }
        }
    }

    private static boolean booleanRand() {
        return new Random().nextBoolean();
    }
}
