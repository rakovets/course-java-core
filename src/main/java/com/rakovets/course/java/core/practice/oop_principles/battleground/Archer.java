package com.rakovets.course.java.core.practice.oop_principles.battleground;

public class Archer extends Hero {
    public Archer (String name, int health, boolean isAlive) {
        super(name, health, isAlive);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        final int ARCHER_DAMAGE = 25;
        if (enemy.isAlive()) {
            enemy.takeDamage(ARCHER_DAMAGE);
        }
    }

    public void lethalShot(Enemy enemy) {
        if (enemy.isAlive()) {
            enemy.takeDamage(enemy.getHealth());
        }
    }

    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}
