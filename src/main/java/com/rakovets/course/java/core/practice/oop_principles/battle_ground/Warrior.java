package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    public Warrior(String name, double health) {
        super(name, health);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
    }
}
