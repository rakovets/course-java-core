package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;

import java.util.Random;

public class Zombie extends Enemy {
    static final Random RANDOM = new Random();

    /**
     * Constructor.
     *
     * @param healthZombie zombie max health.
     * @param damageZombie maximum zombie damage.
     */
    public Zombie(int healthZombie, int damageZombie) {
        super(healthZombie, damageZombie);
    }

    /**
     * Zombie attacks the hero.
     *
     * @param hero attacked hero.
     */
    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(getDamageEnemy());
    }

    /**
     * Zombies take damage.
     * <p> Passive ability.
     * <p>Zombies can resurrect from death with half their maximum health.
     *
     * @param damage the damage the zombie takes.
     */
    @Override
    public void takeDamage(int damage) {
        int healthDivisor = 2;

        boolean live = RANDOM.nextBoolean();

        if (isAlive()) {
            if (getHealthEnemy() - damage < MINIMAL_HP) {
                setHealthEnemy(MINIMAL_HP);
            } else if (getHealthEnemy() - damage == MINIMAL_HP) {
                if (live) {
                    setHealthEnemy(getHealthEnemy() / healthDivisor);
                } else {
                    setHealthEnemy(MINIMAL_HP);
                }
            } else {
                setHealthEnemy(getHealthEnemy() - damage);
            }
        }
    }
}
