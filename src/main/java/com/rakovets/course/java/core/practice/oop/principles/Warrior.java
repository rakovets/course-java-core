package com.rakovets.course.java.core.practice.oop.principles;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public String attackEnemy() {
        return ("Warrior attack enemy");
    }

    @Override
    public int takeDamage(int damage) {
        return Enemy.takeDamage(25);
    }
}
