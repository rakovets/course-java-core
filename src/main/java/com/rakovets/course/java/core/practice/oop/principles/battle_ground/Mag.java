package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Mag extends Hero {
    public Mag(String name, int healthPoint) {
        super(name, healthPoint);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(50);
        System.out.println("Mag is attack enemy");
    }

    @Override
    public void isUniquePower(Enemy enemy) {
        enemy.takeDamage(100);
    }
}
