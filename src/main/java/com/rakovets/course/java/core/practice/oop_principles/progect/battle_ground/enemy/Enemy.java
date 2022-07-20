package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.Mortal;

public abstract class Enemy implements Mortal {
    protected static final int MINIMAL_HP = 0;
    protected static final int MINIMAL_DAMAGE = 0;

    private int healthEnemy;
    private int damageEnemy;

    /**
     * Constructor.
     *
     * @param healthEnemy maximum enemy health.
     * @param damageEnemy maximum enemy damage.
     */
    protected Enemy(int healthEnemy, int damageEnemy) {
        this.healthEnemy = healthEnemy;
        this.damageEnemy = damageEnemy;
    }

    /**
     * The enemy attacks the hero.
     *
     * @param hero attacked hero.
     */
    protected abstract void attackHero(Hero hero);

    /**
     * The enemy takes damage.
     *
     * @param damage the enemy takes.
     */
    public void takeDamage(int damage) {
        if (this.healthEnemy - damage <= MINIMAL_HP) {
            this.healthEnemy = MINIMAL_HP;
        } else {
            this.healthEnemy -= damage;
        }
    }

    /**
     * Current state.
     *
     * @return true if alive, false if dead.
     */
    @Override
    public boolean isAlive() {
        return getHealthEnemy() > MINIMAL_HP;
    }

    public int getHealthEnemy() {
        return this.healthEnemy;
    }

    /**
     * Makes a check when setting current health.
     * <p>If the value received is less than zero, sets the current value to 0.
     *
     * @param health current health.
     */
    public void setHealthEnemy(int health) {
        this.healthEnemy = Math.max(health, MINIMAL_HP);
    }

    public int getDamageEnemy() {
        return damageEnemy;
    }

    /**
     * Makes a check when setting the current damage value.
     * <p>If the value received is less than zero, sets the current value to 0.
     *
     * @param damageEnemy current damage.
     */
    public void setDamageEnemy(int damageEnemy) {
        this.damageEnemy = Math.max(damageEnemy, MINIMAL_DAMAGE);
    }
}
