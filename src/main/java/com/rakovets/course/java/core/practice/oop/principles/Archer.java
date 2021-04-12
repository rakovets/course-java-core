package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero {

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attacks");
        enemy.takeDamage(-15);
    }

    public Archer(String name, int health) {
        super(name, health);
    }

    public void rainOfArrows(Enemy enemy) {
        enemy.takeDamage(-50);
    }
}
