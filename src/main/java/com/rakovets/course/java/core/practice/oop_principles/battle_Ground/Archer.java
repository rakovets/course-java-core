package com.rakovets.course.java.core.practice.oop_principles.battle_Ground;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer Attack Enemy!!!");
        if (enemy.isAlive()) {
            enemy.takeDamage(15);
        }
    }

    @Override
    public void skillHero(Enemy enemy) {
        final int doubleShot = 30;
        enemy.takeDamage(doubleShot);
    }

    @Override
    public boolean isAlive() {
        return super.getHealth() > 0;
    }
}

