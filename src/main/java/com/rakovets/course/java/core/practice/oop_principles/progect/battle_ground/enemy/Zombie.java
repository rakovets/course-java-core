package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;

import java.util.Random;

public class Zombie extends Enemy {
    final int DAMAGE_ZOMBIE = 12;
    Random random = new Random();

    public Zombie(int health) {
        super(health);
    }

    /**
     * Deals damage to the hero.
     *
     * @param hero type hero.
     */
    @Override
    public void attackHero(Hero hero) {
        hero.takingDamage(DAMAGE_ZOMBIE);
    }

    /**
     * Subtracts damage taken from current health.
     * <p>
     * Passive Ability: Can randomly resurrect after death.
     *
     * @param damage damage taken.
     */
    public void takingDamage(int damage) {
        if (isAlive()) {
            if (getHealth() - damage < 0) {
                setHealth(0);
            } else if (getHealth() - damage == 0) {
                boolean live = random.nextBoolean();

                if (live) {
                    setHealth(super.getHealth());
                } else {
                    setHealth(getHealth() - damage);
                }
            } else {
                setHealth(getHealth() - damage);
            }
        }
    }

    public int getDAMAGE_ZOMBIE() {
        return DAMAGE_ZOMBIE;
    }
}
