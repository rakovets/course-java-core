package com.rakovets.course.java.core.practice.oop.principles;

public class Mag extends Hero {

    public Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
    }
}
