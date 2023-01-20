package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println("Warrior attacks with sword!");
    }
}
