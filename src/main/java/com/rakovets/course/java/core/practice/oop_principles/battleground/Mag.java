package com.rakovets.course.java.core.practice.oop_principles.battleground;

public class Mag extends Hero {
    public Mag(String name, int health, boolean isAlive) {
        super(name, health, isAlive);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        final int MAG_DAMAGE = 40;
        if (enemy.isAlive()) {
            enemy.takeDamage(MAG_DAMAGE);
        }
    }

    public void battleHeal() {
        final int HEAL_VALUE = 20;
        if (this.isAlive()) {
            setHealth(this.getHealth() + HEAL_VALUE);
        }
    }

    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}
