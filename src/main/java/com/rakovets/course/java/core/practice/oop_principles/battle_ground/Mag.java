package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    private final int DAMAGE_MAG = 20;
    public final int DAMAGE_REDUCER = 10;

    public Mag(String name, int health, boolean isAlive) {
        super(name, health, isAlive);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE_MAG);
    }

    public void attackEnemyDecreased(Enemy enemy) {
        enemy.takeDamage(DAMAGE_MAG - DAMAGE_REDUCER);
    }
}
