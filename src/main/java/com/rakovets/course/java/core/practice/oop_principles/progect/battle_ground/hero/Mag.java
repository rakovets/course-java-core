package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

public class Mag extends Hero {
    /**
     * Constructor.
     *
     * @param nameMag   magician's name.
     * @param healthMag mage's maximum health.
     * @param damageMag mage max damage.
     */
    public Mag(String nameMag, int healthMag, int damageMag) {
        super(nameMag, healthMag, damageMag);
    }

    /**
     * Magician attacks the enemy.
     *
     * @param enemy attacked enemy.
     */
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamageHero());
    }

    /**
     * Mage takes damage.
     * <p>Passive ability.
     * <p>If the mage takes damage and his health drops below zero, then his current health is 0.
     * <p> If the mage takes damage and his health does not fall below zero, then the mage can heal
     * himself if the mage's health after taking damage is less than 50.
     * <p>When healed, the mage cannot restore more health to himself than his maximum health.
     * <p> If the mage takes damage and his health has not dropped to 50, then the healing does not work.
     *
     * @param damage damage received.
     * @return current health after taking damage.
     */
    @Override
    public int takeDamage(int damage) {
        final int HEALING = 25;
        final int MINIMAL_HEALING = 50;
        final int PERCENTAGE = 100;

        int health = getHealthHero();

        if (isAlive()) {
            if (getHealthHero() - damage <= MINIMAL_HP) {
                setHealthHero(MINIMAL_HP);
                health = getHealthHero();
            } else if (getHealthHero() * MINIMAL_HEALING / PERCENTAGE <= MINIMAL_HEALING) {
                setHealthHero(Math.min(getHealthHero() - damage + HEALING, getHealthHero()));
                health = getHealthHero();
            } else {
                setHealthHero(getHealthHero() - damage);
                health = getHealthHero();
            }
        }
        return health;
    }
}
