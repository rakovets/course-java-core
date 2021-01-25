package com.rakovets.course.java.core.practice.oop.principles.battle.ground.tests;

public class Archer extends Hero {
    private static int health;

    public Archer(String name, int health) {
        super(name, health);
        Archer.health = health;
    }

    @Override
    public String attackEnemy() {
        return ("Archer is attacking enemy");
    }

    @Override
    public int takeDamage(int damage) {
        return Enemy.takeDamage(100);
    }

    public int addHealth() {
        if (Archer.health <= 0) {
            return Archer.health + 500;
        } else {
            return Archer.health;
        }
    }
}
