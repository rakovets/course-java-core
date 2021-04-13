package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Archer extends Hero {
    public Archer(String name, int healthPoint) {
        super(name, healthPoint);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(30);
        System.out.println("Archer is attack enemy");
    }

    @Override
    public void isUniquePower(Enemy enemy) {
        enemy.takeDamage(25);
        setHealthPoint(getHealthPoint() + 25);
    }
}
