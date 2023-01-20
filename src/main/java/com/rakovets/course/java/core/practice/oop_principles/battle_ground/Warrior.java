package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 8;
        enemy.takeDamage(damage);
        System.out.println("Again work");
    }

    public void crazyAttackEnemy(Enemy enemy) {
        int damage = 25;
        enemy.takeDamage(damage);
        System.out.println("For Azeroth! For the Alliance!");
    }
}
