package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attacks");
        enemy.takeDamage(-15);
    }

    public void rainOfArrows(Enemy enemy) {
        enemy.takeDamage(-50);
    }
}
