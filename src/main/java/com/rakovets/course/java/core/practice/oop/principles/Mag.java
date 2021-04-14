package com.rakovets.course.java.core.practice.oop.principles;

public class Mag extends Hero {

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Magician attacks!");
        enemy.takeDamage(-10);
    }

    public void blizzard(Enemy enemy) {
        enemy.takeDamage(-20);
    }
}
