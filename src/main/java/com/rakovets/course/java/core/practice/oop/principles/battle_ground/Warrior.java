package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Warrior extends Hero {
    public Warrior(String name, int healthPoint) {
        super(name, healthPoint);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println("Warrior is attack enemy");
    }

    @Override
    public void isUniquePower(Enemy enemy) {
        enemy.takeDamage(50);
        setHealthPoint(getHealthPoint() + 10);
    }
}
