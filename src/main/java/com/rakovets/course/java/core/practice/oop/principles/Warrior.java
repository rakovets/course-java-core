package com.rakovets.course.java.core.practice.oop.principles;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой аттакует врага");
        enemy.takeDamage(10);
    }
}
