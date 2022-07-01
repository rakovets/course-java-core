package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.cat_home.Person;

import java.util.Random;

public class Zombie extends Enemy {
    private int copyHealth;

    public Zombie(int health) {
        super(health);
        this.copyHealth = health;
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
            reincarnation();
        } else {
            System.out.println("He is dead.");
        }
    }

    public void reincarnation() {
        if (!isAlive()) {
            if (booleanRand()) {
                setHealth(copyHealth);
            }
        }
    }

    private static boolean booleanRand() {
        return new Random().nextBoolean();
    }
}
