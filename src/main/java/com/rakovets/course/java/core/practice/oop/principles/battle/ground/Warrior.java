package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    public Warrior(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("герой атакует врага");
        enemy.takeDamage(10);
    }
}
