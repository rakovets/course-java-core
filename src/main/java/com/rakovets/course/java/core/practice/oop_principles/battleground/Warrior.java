package com.rakovets.course.java.core.practice.oop_principles.battleground;

public class Warrior extends Hero {
    public Warrior(String name, int health, boolean isAlive) {
        super(name, health, isAlive);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        final int WARRIOR_DAMAGE = 10;
        if (enemy.isAlive()) {
            enemy.takeDamage(WARRIOR_DAMAGE);
        }
    }

    public void doubleDamage(Enemy enemy) {
        if (enemy.isAlive()) {
            attackEnemy(enemy);
            attackEnemy(enemy);
        }
    }

    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}
