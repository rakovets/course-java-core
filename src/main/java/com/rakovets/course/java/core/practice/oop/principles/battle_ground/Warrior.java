package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Warrior extends Hero {
    private int health;
    private final int DAMAGE = 100;

    public Warrior(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
    }
}
