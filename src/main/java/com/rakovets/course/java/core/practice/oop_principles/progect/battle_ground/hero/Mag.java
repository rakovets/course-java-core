package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

public class Mag extends Hero {
    final int HEALING = 25;
    final int MINIMAL_HEALING = 50;
    final int PERCENTAGE = 100;
    private int damageMag = 17;

    public Mag(String name, int health) {
        super(name, health);
    }

    /**
     * Mage attacks the enemy.
     *
     * @param enemy type enemy.
     */
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takingDamage(damageMag);
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
        int health = MIN_HP;

        if (isAlive()) {
            if (getHealth() - damage <= MIN_HP) {
                setHealth(MIN_HP);
            } else if (getHealth() * MINIMAL_HEALING / PERCENTAGE <= MINIMAL_HEALING) {
                setHealth(getHealth() - damage + HEALING);
                health = getHealth();
            } else {
                setHealth(getHealth() - damage);
                health = getHealth();
            }
        }
        return health;
    }

    public int getDamageMag() {
        return damageMag;
    }

    public void setDamageMag(int damageMag) {
        this.damageMag = damageMag;
    }
}
