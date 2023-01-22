package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Warrior extends Hero {
    Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Sword attack!!!");
        enemy.takeDamage(5);
    }

    public void ultimateAttackEnemy(Enemy enemy) {
        System.out.println("Ultimate sword attack!!!");
        enemy.takeDamage(15);
    }
}
