package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Mag extends Hero {

    public Mag(String name) {
        super(name);
    }

    public Mag(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("герой атакует врага");
        enemy.takeDamage(35);
    }
}
