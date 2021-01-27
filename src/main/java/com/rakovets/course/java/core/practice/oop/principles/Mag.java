package com.rakovets.course.java.core.practice.oop.principles;

public class Mag extends Hero {

    public Mag(String name) {
        super(name);
    }

    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        return "Mag is attacking the enemy";
    }
}
