package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(25);
        return "Archer is attacking the enemy";
    }
}
