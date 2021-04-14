package com.rakovets.course.java.core.practice.oop.principles;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior attacks!");
        enemy.takeDamage(-5);
    }

    public void doomPunch(Enemy enemy) {
        enemy.takeDamage(-40);
    }

}
