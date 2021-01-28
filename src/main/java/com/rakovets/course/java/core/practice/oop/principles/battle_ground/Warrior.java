package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Warrior extends Hero {
    private int health;

    public Warrior(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(100);
    }
}
