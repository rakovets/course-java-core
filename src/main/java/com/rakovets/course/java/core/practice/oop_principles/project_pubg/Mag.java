package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Mag extends Hero {
    Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Frost bolt attack!!!");
        enemy.takeDamage(3);
    }

    public void ultimateAttackEnemy(Enemy enemy) {
        System.out.println("Ultimate frost bolt attack!!!");
        enemy.takeDamage(9);
    }
}
