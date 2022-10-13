package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    private final int MAG_DAMAGE = 20;

    public Mag(String name, int health, boolean isAlive) {
        super(name, health, isAlive);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(MAG_DAMAGE);
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
