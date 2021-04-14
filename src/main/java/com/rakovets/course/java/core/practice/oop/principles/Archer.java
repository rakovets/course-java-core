package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero {
    private final int DAMAGE = 15;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attacks");
        enemy.takeDamage(DAMAGE);
    }

    public void rainOfArrows(Enemy enemy) {
        enemy.takeDamage(30 + DAMAGE);
    }
}
