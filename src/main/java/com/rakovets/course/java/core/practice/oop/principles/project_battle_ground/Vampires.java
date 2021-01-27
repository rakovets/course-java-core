package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

import java.util.concurrent.ThreadLocalRandom;

public class Vampires extends Enemy {

    public Vampires(int health) {
        super(health);
    }

    @Override
    public String attackHero(Hero hero) {
        if (isAlive()) {
            hero.takeDamage(20);
            return "Vampires attack " + hero.getClass().getSimpleName() + " with 20 points of damage";
        } else {
            return "Mutant is died";
        }
    }

    //special ability
    public String isRegenerate(Vampires vampires) {
        if (isAlive()) {
            if (vampires.getHealth() < 20) {
                if (ThreadLocalRandom.current().nextInt(2) > 0) {
                    takeDamage(-5);
                    return "Regeneration is successful: + 5 health point";
                } else {
                    return "Regeneration is not successful";
                }
            } else {
                return "Vampire has more than 20 points of health";
            }
        } else {
            return "Vampire is died";
        }
    }
}
