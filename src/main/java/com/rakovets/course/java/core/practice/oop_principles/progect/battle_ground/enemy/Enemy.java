package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.Mortal;

public abstract class Enemy implements Mortal {
    private int healthEnemy;

    /**
     * Constructor.
     *
     * @param health indicator of health.
     */
    protected Enemy(int health) {
        this.healthEnemy = health;
    }

    /**
     * An abstract class requiring an implementation.
     *
     * @param hero type hero.
     */
    protected abstract void attackEnemy(Hero hero);

    /**
     * Subtracts damage taken from current health.
     *
     * @param damage damage taken.
     */
    public void takingDamage(int damage) {
        if (this.healthEnemy - damage <= 0) {
            this.healthEnemy = 0;
        } else {
            this.healthEnemy -= damage;
        }
    }

    /**
     * Checks if the enemy is alive.
     *
     * @return the result of a boolean comparison of the enemy's health with the damage received.
     */
    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    public int getHealth() {
        return this.healthEnemy;
    }

    public void setHealth(int health) {
        this.healthEnemy = health;
    }
}
