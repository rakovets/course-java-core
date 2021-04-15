package com.rakovets.course.java.core.practice.oop.principles;

public class Mag extends Hero {

    protected Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(50);
    }

    public void telekinesisAttackEnemy(Enemy enemy) {
        enemy.takeDamage(60);
    }
}
