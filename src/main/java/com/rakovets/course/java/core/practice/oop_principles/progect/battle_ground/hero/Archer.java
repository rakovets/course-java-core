package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

public class Archer extends Hero {
    private int DAMAGES_ARCHER = 20;
    final int BOOSTER_SHOT = 40;

    public Archer(String name, int health) {
        super(name, health);
    }

    /**
     * Deals archer damage to an enemy.
     *
     * @param enemy type enemy.
     */
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takingDamage(DAMAGES_ARCHER);
    }

    /**
     * Empowered Shot deals double Archer damage to an enemy.
     *
     * @param enemy type enemy.
     */
    protected void boostedShot(Enemy enemy) {
        enemy.takingDamage(BOOSTER_SHOT);
    }

    public void setDamageArcher(int damageArcher) {
        this.DAMAGES_ARCHER = damageArcher;
    }

    public int getDAMAGES_ARCHER() {
        return DAMAGES_ARCHER;
    }
}
