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
     *
     * @param damage the damage it takes.
     */
    @Override
    public void takeDamage(int damage) {
        final int REGENERATION = 15;

        if (isAlive()) {
            if (getHealthEnemy() - damage <= MINIMAL_HP) {
                setHealthEnemy(MINIMAL_HP);
            } else {
                setHealthEnemy(getHealthEnemy() - damage + REGENERATION);
            }
        }
    }
}
