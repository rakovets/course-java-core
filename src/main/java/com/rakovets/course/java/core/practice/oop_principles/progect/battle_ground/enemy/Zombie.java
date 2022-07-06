package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;

import java.util.Random;

public class Zombie extends Enemy {
    Random random = new Random();

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
     * The zombie takes damage.
     * <p> Passive ability.
     * <p>Zombies can resurrect after death.
     *
     * @param damage the damage it takes.
     */
    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            if (getHealthEnemy() - damage < MINIMAL_HP) {
                setHealthEnemy(MINIMAL_HP);
            } else if (getHealthEnemy() - damage == MINIMAL_HP) {
                boolean live = random.nextBoolean();
                if (live) {
                    setHealthEnemy(super.getHealthEnemy());
                }
            } else {
                setHealthEnemy(getHealthEnemy() - damage);
            }
        }
    }
}
