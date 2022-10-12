package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
    private final int DAMAGE_ARCHER = 10;

    public Archer(String name, int health, boolean isAlive) {
        super(name, health, isAlive);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE_ARCHER);
    }

    public void attackEnemyFatality(Enemy enemy) {
        do {
            enemy.takeDamage(DAMAGE_ARCHER);
        } while (enemy.getHealth() > 0);
    }
}
