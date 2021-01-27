package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой аттакует врага");
        enemy.takeDamage(30);
    }
}
