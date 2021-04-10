package com.rakovets.course.java.core.practice.oop.principles;

public class Mag extends Hero {

    public void attackEnemy() {
        System.out.println("Маг атакует!");
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(-10);
    }

    public Mag(String name) {
        super(name);
    }

    public int blizzard(){
        return -30;
    }
}
