package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 4;
        enemy.takeDamage(damage);
        System.out.println("Where is the enemy?");
    }

    public void aimedShot(Enemy enemy) {
        int damage = 15;
        enemy.takeDamage(damage);
        System.out.println("He who shoots first laughs last.");
    }
}
