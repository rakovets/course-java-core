package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

import java.util.concurrent.ThreadLocalRandom;

public class Archer extends Hero {
    public static final int ARCHER_DAMAGE = 5;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(ARCHER_DAMAGE);
        return "Warrior attack " + enemy.getClass().getSimpleName() + " with 5 points of damage";
    }

    public String takePowerShot(Enemy enemy) {
        if (isAlive()) {
            if (ThreadLocalRandom.current().nextInt(2) > 0) {
                enemy.takeDamage(15);
                return "Powershot is successful. " + enemy.getClass().getSimpleName() + " with 15 points of damage";
            } else {
                return "Powershot is not successful";
            }
        } else {
            return "Archer is died";
        }
    }
}
