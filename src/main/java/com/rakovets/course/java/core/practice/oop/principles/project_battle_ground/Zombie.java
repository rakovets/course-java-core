package com.rakovets.course.java.core.practice.oop.principles.project_battle_ground;

import java.util.concurrent.ThreadLocalRandom;
public class Zombie extends Enemy {
    public static final int ZOMBIE_DAMAGE = 10;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public String attackHero(Hero hero) {
        if (isAlive()) {
            hero.takeDamage(ZOMBIE_DAMAGE);
            return "Zombie attack " + hero.getClass().getSimpleName() + " with 10 points of damage";
        } else {
            return "Zombie is died";
        }
    }

    public String isRessurect() {
        if (!isAlive()) {
            if (ThreadLocalRandom.current().nextInt(3) > 0) {
                takeDamage(-20);
                return "Zombie ressurected";
            } else {
                return "Zombie didn't ressurect";
            }
        } else {
            return "Zombie still alive";
        }
    }
}

