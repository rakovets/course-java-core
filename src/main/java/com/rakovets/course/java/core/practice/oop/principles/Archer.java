package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero {

    protected Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
    }

    public void crossbowAttackEnemy(Enemy enemy) {
        enemy.takeDamage(50);
    }
}
