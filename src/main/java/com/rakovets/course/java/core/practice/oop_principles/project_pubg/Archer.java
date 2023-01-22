package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Archer extends Hero {
    Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Bow attack!!!");
        enemy.takeDamage(1);
    }

    public void ultimateAttackEnemy(Enemy enemy) {
        System.out.println("Ultimate bow attack!!!");
        enemy.takeDamage(3);
    }
}
