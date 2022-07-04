package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.Mortal;

public abstract class Enemy implements Mortal {
    final int MIN_HP = 0;
    private int healthEnemy;

    protected Enemy(int health) {
        this.healthEnemy = health;
    }

    protected abstract void attackHero(Hero hero);

    /**
     * Subtracts damage taken from current health.
     *
     * @param damage damage taken.
     */
    public void takingDamage(int damage) {
        if (this.healthEnemy - damage <= MIN_HP) {
            this.healthEnemy = MIN_HP;
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
        return getHealth() > MIN_HP;
    }

    public int getHealth() {
        return this.healthEnemy;
    }

    public void setHealth(int health) {
        this.healthEnemy = health;
    }
}
