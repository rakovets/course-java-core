package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(19);
    }
}
