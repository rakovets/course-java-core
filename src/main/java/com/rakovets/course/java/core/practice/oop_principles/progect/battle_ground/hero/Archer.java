package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;

public class Archer extends Hero {
    private int damageArcher = 20;
    private int boostShot = 40;

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
        enemy.takingDamage(damageArcher);
    }

    /**
     * Empowered Shot deals double Archer damage to an enemy.
     *
     * @param enemy type enemy.
     */
    public void boostedShot(Enemy enemy) {
        enemy.takingDamage(boostShot);
    }

    public void setDamageArcher(int damageArcher) {
        this.damageArcher = damageArcher;
    }

    public int getDamageArcher() {
        return damageArcher;
    }

    public int getBoostShot() {
        return boostShot;
    }

    public void setBoostShot(int boostShot) {
        this.boostShot = boostShot;
    }
}
