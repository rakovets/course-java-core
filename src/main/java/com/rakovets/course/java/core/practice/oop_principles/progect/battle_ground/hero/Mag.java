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
     * <li>If the mage takes damage and his health drops below zero, then his current health is 0.
     * <li> If the mage takes damage and his health does not fall below zero, then the mage can heal
     * himself if the mage's health after taking damage is less than 50.
     * <li>When healed, the mage cannot restore more health to himself than his maximum health.
     * <li> If the mage takes damage and his health has not dropped to 50, then the healing does not work.
     *
     * @param damage the mage takes.
     */
    @Override
    public void takeDamage(int damage) {
        int health = 25;
        int minimalHealing = 50;
        int percentage = 100;


        if (isAlive()) {
            if (getHealthHero() - damage <= MINIMAL_HP) {
                setHealthHero(MINIMAL_HP);
            } else if (getHealthHero() * minimalHealing / percentage <= minimalHealing) {
                setHealthHero(Math.min(getHealthHero() - damage + health, getHealthHero()));
            } else {
                setHealthHero(getHealthHero() - damage);
            }
        }
    }
}
