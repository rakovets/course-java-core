package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import java.util.Random;

public class Poring extends Enemy{
    public Poring(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero, int damage) {
        if (isAlive()) {
            if (isDoubleAttack()) {
                hero.takeDamage(damage * 2);
            } else {
                hero.takeDamage(damage);
            }
        }
    }

    private boolean isDoubleAttack() {
        return new Random().nextBoolean();
    }
}
