package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;

public class Vampire extends Enemy {
    /**
     * Constructor.
     *
     * @param healthVampire maximum vampire health.
     * @param damageVampire maximum vampire damage.
     */
    public Vampire(int healthVampire, int damageVampire) {
        super(healthVampire, damageVampire);
    }

    /**
     * The vampire attacks the hero.
     *
     * @param hero attacked hero.
     */
    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(getDamageEnemy());
    }

    /**
     * The vampire takes damage.
     * <ul> Vampire regeneration.
     * <ul> Passive ability.
     * <li> If a vampire takes damage and their health falls below zero, then their current health is 0.
     * <li> If the vampire takes damage and his health does not fall below zero, then the vampire heals himself.
     * <li> When regenerating, the vampire cannot restore more health to himself than his maximum health.
     *
     * @param damage the damage it takes.
     */
    @Override
    public void takeDamage(int damage) {
        final int REGENERATION = 15;

        if (isAlive()) {
            if (getHealthEnemy() - damage <= MINIMAL_HP) {
                setHealthEnemy(MINIMAL_HP);
            } else if (getHealthEnemy() - damage + REGENERATION > getHealthEnemy()) {
                setDamageEnemy(super.getDamageEnemy());
            } else {
                setHealthEnemy(getHealthEnemy() - damage + REGENERATION);
            }
        }
    }
}
