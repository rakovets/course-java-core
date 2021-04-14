package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Warrior extends Hero {
    private final int DAMAGE = 5;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior attacks!");
        enemy.takeDamage(DAMAGE);
    }

    public void doomPunch(Enemy enemy) {
        enemy.takeDamage(30 + DAMAGE);
    }

}
