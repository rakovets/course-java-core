package com.rakovets.course.java.core.practice.oop.principles.battle_groundTest;

public class Mag extends Hero {
    private final int DAMAGE = 10;

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Magician attacks!");
        enemy.takeDamage(DAMAGE);
    }

    public void blizzard(Enemy enemy) {
        enemy.takeDamage(10 + DAMAGE);
    }
}
