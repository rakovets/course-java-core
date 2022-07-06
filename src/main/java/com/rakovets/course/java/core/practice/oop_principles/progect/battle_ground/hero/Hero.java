package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.Mortal;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

public abstract class Hero implements Mortal {
    private final String name;
    final int MINIMAL_HP = 0;
    final int MINIMAL_DAMAGE = 0;

    private int damageHero;
    private int healthHero;

    /**
     * Constructor.
     *
     * @param name       hero's name.
     * @param healthHero hero's maximum health.
     * @param damageHero hero's maximum damage.
     */
    protected Hero(String name, int healthHero, int damageHero) {
        this.name = name;
        this.healthHero = healthHero;
        this.damageHero = damageHero;
    }

    /**
     * The hero attacks the enemy.
     *
     * @param enemy attacked enemy.
     */
    protected abstract void attackEnemy(Enemy enemy);

    /**
     * The hero takes damage.
     *
     * @param damage damage received.
     * @return current health after taking damage.
     */
    public int takeDamage(int damage) {
        if (this.healthHero - damage <= MINIMAL_HP) {
            return this.healthHero = MINIMAL_HP;
        } else {
            return this.healthHero -= damage;
        }
    }

    /**
     * Current state.
     *
     * @return true if alive, false if dead.
     */
    @Override
    public boolean isAlive() {
        return this.healthHero > MINIMAL_HP;
    }

    public String getName() {
        return name;
    }

    public int getHealthHero() {
        return healthHero;
    }

    /**
     * Makes a check when setting current health.
     * <p>If the value received is less than zero, sets the current value to 0.
     *
     * @param healthHero current health.
     */
    public void setHealthHero(int healthHero) {
        this.healthHero = Math.max(healthHero, MINIMAL_HP);
    }

    public int getDamageHero() {
        return damageHero;
    }

    /**
     * Makes a check when setting the current damage value.
     * <p>If the value received is less than zero, sets the current value to 0.
     *
     * @param damageHero current damage.
     */
    public void setDamageHero(int damageHero) {
        this.damageHero = Math.max(damageHero, MINIMAL_DAMAGE);
    }
}
