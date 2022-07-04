package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

import java.util.Random;

public class Warrior extends Hero {
    Random random = new Random();

    protected Warrior(String name, int health) {
        super(name, health);
    }

    /**
     * Warrior attacks the enemy.
     *
     * @param enemy type enemy.
     */
    @Override
    protected void attackEnemy(Enemy enemy) {
        final int DAMAGE_WARRIOR = 24;

        enemy.takingDamage(DAMAGE_WARRIOR);
    }

    /**
     * Subtracts damage taken from current health.
     *
     * @param damage damage taken.
     * @return remaining HP.
     */
    @Override
    public int takingDamage(int damage) {
        final int SHIELD_BLOCK = 10;

        int health = 0;

        if (isAlive()) {
            if (getHealth() - damage < 0) {
                setHealth(0);
                health = getHealth();
            } else if (getHealth() - damage != 0) {
                boolean block = random.nextBoolean();

                if (block) {
                    setHealth(getHealth() - damage + SHIELD_BLOCK);
                    health = getHealth();
                }
            }
        }
        return health;
    }
}
