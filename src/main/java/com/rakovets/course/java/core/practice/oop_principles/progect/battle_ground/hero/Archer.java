package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

public class Archer extends Hero {
    /**
     * Constructor.
     *
     * @param nameArcher   archer's name.
     * @param healthArcher archer's maximum health.
     * @param damageArcher archer's maximum damage.
     */
    public Archer(String nameArcher, int healthArcher, int damageArcher) {
        super(nameArcher, healthArcher, damageArcher);
    }

    /**
     * The archer attacks the enemy.
     *
     * @param enemy attacked enemy.
     */
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamageHero());
    }

    /**
     * Reinforced shot.
     * <p> Doubles the archer's current maximum damage.
     */
    public void boostedShot(Enemy enemy) {
        int attackMultiplier = 2;

        enemy.takeDamage(getDamageHero() * attackMultiplier);
    }
}
