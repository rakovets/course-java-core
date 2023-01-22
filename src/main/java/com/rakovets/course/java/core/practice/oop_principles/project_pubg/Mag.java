package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Mag extends Hero {
    public Mag() {
    }

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Frost bolt attack!!!");
        int attackDamage = 3;
        enemy.takeDamage(attackDamage);
    }

    public void ultimateAttackEnemy(Enemy enemy) {
        System.out.println("Ultimate frost bolt attack!!!");
        int ultimateAttackDamage = 9;
        enemy.takeDamage(ultimateAttackDamage);
    }
}
