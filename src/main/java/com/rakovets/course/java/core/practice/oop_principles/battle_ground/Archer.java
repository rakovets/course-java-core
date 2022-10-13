package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
    private final int ARCHER_DAMAGE = 30;

    public Archer(String name, int health, boolean isAlive) {
        super(name, health, isAlive);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(ARCHER_DAMAGE);
    }

    @Override
    public boolean isAlive() {
        return isAlive();
    }
}
