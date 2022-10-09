package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    private final int DAMAGE_WARRIOR = 30;
    public final int DAMAGE_MULTIPLAYER = 3;

    public Warrior(String name, int health, boolean isAlive) {
        super(name, health, isAlive);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE_WARRIOR);
    }

    public void attackEnemyIncreased(Enemy enemy) {
        enemy.takeDamage(DAMAGE_WARRIOR * DAMAGE_MULTIPLAYER);
    }
}
