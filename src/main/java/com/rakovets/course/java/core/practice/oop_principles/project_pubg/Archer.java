package com.rakovets.course.java.core.practice.oop_principles.project_pubg;

public class Archer extends Hero {
    public Archer() {
    }

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Bow attack!!!");
        int attackDamage = 1;
        enemy.takeDamage(attackDamage);
    }

    public void ultimateAttackEnemy(Enemy enemy) {
        System.out.println("Ultimate bow attack!!!");
        int ultimateAttackDamage = 3;
        enemy.takeDamage(ultimateAttackDamage);
    }
}
