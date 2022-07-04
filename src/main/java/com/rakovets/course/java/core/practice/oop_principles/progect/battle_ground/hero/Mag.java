package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

public class Mag extends Hero {
    protected Mag(String name, int health) {
        super(name, health);
    }

    /**
     * Mage attacks the enemy.
     *
     * @param enemy type enemy.
     */
    @Override
    protected void attackEnemy(Enemy enemy) {
        final int DAMAGE_MAGE = 17;

        enemy.takingDamage(DAMAGE_MAGE);
    }

    /**
     * Healing HP.
     * <p>
     * Ability active.
     *
     * @param damage damage taken.
     */
    @Override
    public int takingDamage(int damage) {
        final int HEALING = 25;
        final int MINIMAL_HEALING = 50;
        final int PERCENTAGE = 100;

        int health = 0;

        if (isAlive()) {
            if (getHealth() - damage <= 0) {
                setHealth(0);
            } else if (getHealth() * MINIMAL_HEALING / PERCENTAGE <= MINIMAL_HEALING) {
                setHealth(getHealth() - damage + HEALING);
            }
            health = getHealth();
        }
        return health;
    }
}
