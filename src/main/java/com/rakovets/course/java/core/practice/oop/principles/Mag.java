package com.rakovets.course.java.core.practice.oop.principles;

public class Mag extends Hero {

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Magician attacks!");
        enemy.takeDamage(-10);
    }

    public Mag(String name, int health) {
        super(name, health);
    }

    public void blizzard(Enemy enemy) {
        enemy.takeDamage(-20);
    }
}
