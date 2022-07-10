package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

import java.util.Random;

public class Warrior extends Hero {
    Random random = new Random();

    /**
     * Constructor.
     *
     * @param nameWarrior   warrior name.
     * @param healthWarrior warrior's maximum health.
     * @param damageWarrior maximum damage of a warrior.
     */
    public Warrior(String nameWarrior, int healthWarrior, int damageWarrior) {
        super(nameWarrior, healthWarrior, damageWarrior);
    }

    /**
     * The warrior attacks the enemy.
     *
     * @param enemy attacked enemy.
     */
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamageHero());
    }

    /**
     * The warrior takes damage.
     * <p>Passive ability.
     * <li>Randomly, the warrior blocks 10 damage.
     * <li>A warrior cannot heal himself.
     *
     * @param damage the warrior takes.
     */
    @Override
    public void takeDamage(int damage) {
        boolean block = random.nextBoolean();

        final int SHIELD_BLOCK = 10;

        if (isAlive()) {
            if (getHealthHero() - damage < MINIMAL_HP) {
                setHealthHero(MINIMAL_HP);
            } else {
                if (block) {
                    setHealthHero(Math.min(getHealthHero() - damage + SHIELD_BLOCK, getHealthHero()));
                } else {
                    setHealthHero(getHealthHero() - damage);
                }
            }
        }
    }
}
