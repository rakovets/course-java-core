package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    public Archer(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("герой атакует врага");
        enemy.takeDamage(20);
    }
}
