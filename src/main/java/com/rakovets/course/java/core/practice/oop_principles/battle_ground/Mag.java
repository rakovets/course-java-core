package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import java.util.Random;

public class Mag extends Hero {
    public Mag(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            if (readSpell()) {
                enemy.takeDamage(getDamage());
            }
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
        }
    }

    public void healing(Hero hero) {
        if (readSpell()) {
            hero.setHealth(hero.getHealth() + (hero.getMaxHealth() / 5));
        }
    }

    private static boolean readSpell() {
        return new Random().nextBoolean();
    }
}
