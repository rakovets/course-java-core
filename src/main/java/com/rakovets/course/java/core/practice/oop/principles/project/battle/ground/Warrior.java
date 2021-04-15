package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public class Warrior extends Hero {
    private final int damage = 40;

    public Warrior(String name, int healthPoint) {
        super(name, healthPoint);
    }

    @Override
    public int getHealthPoint() {
        return super.getHealthPoint();
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Warrior " + getName() + " attack enemy!\n");
        enemy.takeDamage(damage);
    }

    @Override
    public void skill(Enemy enemy) {
        System.out.println("\nIgnore armor and doesn't miss");
        enemy.takeSkillDamage(damage);
    }
}
