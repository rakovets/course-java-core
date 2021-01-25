package com.rakovets.course.java.core.practice.oop.principles.battle.ground.tests;

public class Mag extends Hero {
    private static int health;

    public Mag(String name, int health) {
        super(name, health);
        Mag.health = health;
    }

    @Override
    public String attackEnemy() {
        return ("Mag is attacking enemy");
    }

    @Override
    public int takeDamage(int damage) {
        return Enemy.takeDamage(50);
    }

    public int addHealth() {
        if (Mag.health < 100) {
            return Math.abs(Mag.health * 2);
        } else {
            return Mag.health;
        }
    }
}
