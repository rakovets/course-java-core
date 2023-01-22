package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Warrior extends Hero {
    public Warrior() {
    }

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Sword attack!!!");
        int attackDamage = 5;
        enemy.takeDamage(attackDamage);
    }

    public void ultimateAttackEnemy(Enemy enemy) {
        System.out.println("Ultimate sword attack!!!");
        int ultimateAttackDamage = 15;
        enemy.takeDamage(ultimateAttackDamage);
    }
}
