package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;

public class Vampire extends Enemy {
    final int DAMAGE_VAMPIRE = 25;

    public Vampire(int health) {
        super(health);
    }

    /**
     * Deals damage to the hero.
     *
     * @param hero type hero.
     */
    @Override
    public void attackHero(Hero hero) {
        hero.takingDamage(DAMAGE_VAMPIRE);
    }

    /**
     * Restores HP.
     * <p>
     * Passive ability.
     *
     * @param damage damage taken.
     */
    @Override
    public void takingDamage(int damage) {
        final int REGENERATION = 15;

        if (isAlive()) {
            if (getHealth() - damage <= 0) {
                setHealth(0);
            } else {
                setHealth(getHealth() - damage + REGENERATION);
            }
        }
    }

    public int getDAMAGE_VAMPIRE() {
        return DAMAGE_VAMPIRE;
    }
}
