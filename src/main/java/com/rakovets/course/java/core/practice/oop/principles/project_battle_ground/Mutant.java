package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

import java.util.concurrent.ThreadLocalRandom;

public class Mutant extends Enemy{
    public static final int MUTANT_DAMAGE = 20;

    public Mutant(int health) {
        super(health);
    }

    @Override
    public String attackHero(Hero hero) {
        if (isAlive()) {
            hero.takeDamage(MUTANT_DAMAGE);
            return "Mutant attack " + hero.getClass().getSimpleName() + " with 5 points of damage";
        } else {
            return "Mutant is died";
        }
    }

    public String doComboAttack(Hero hero) {
        if (isAlive()) {
            if (ThreadLocalRandom.current().nextInt(2) > 0) {
                hero.takeDamage(10);
                return "Combo attack is successful, " + hero.getClass().getSimpleName() + " with 10 points of damage";
            } else {
                return "Combo attack is not successful";
            }
        } else {
            return "Mutant is died";
        }
    }
}
