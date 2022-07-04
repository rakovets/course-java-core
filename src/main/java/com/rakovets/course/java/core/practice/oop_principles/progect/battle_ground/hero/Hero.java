package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.Mortal;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

public abstract class Hero implements Mortal {
    private final String name;

    private int healthHero;

    protected Hero(String name, int health) {
        this.name = name;
        this.healthHero = health;
    }

    protected abstract void attackEnemy(Enemy enemy);

    /**
     * Subtracts damage taken from current health.
     *
     * @param damage damage taken.
     * @return remaining HP.
     */
    public int takingDamage(int damage) {
        if (this.healthHero - damage <= 0) {
            return this.healthHero = 0;
        } else {
            return this.healthHero -= damage;
        }
    }

    /**
     * @return boolean xp comparison.
     */
    @Override
    public boolean isAlive() {
        return this.healthHero > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return healthHero;
    }

    public void setHealth(int health) {
        this.healthHero = health;
    }
}
