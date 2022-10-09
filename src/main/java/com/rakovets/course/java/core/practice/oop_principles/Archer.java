package com.rakovets.course.java.core.practice.oop_principles;

public class Archer extends  Hero {
    Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Archer attacks enemy");
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
    }
}
