package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import java.util.Random;

public class Mag extends Hero {
    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage) {
        if (isAlive()) {
            if (readSpell()) {
                enemy.takeDamage(damage * PERCENT_OF_DAMAGE);
            } else {
                System.out.println("Nothing happened");
            }
        } else {
            System.out.println("He is dead.");
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
        } else {
            System.out.println("He is dead.");
        }
    }

    public void healing(Hero hero, int heal) {
        if (readSpell()) {
            hero.setHealth(hero.getHealth() + (hero.getCopyHealth() / PERCENT_OF_DAMAGE * 5));
        } else {
            System.out.println("Nothing happened");
        }

    }

    private static boolean readSpell() {
        return new Random().nextBoolean();
    }
}
