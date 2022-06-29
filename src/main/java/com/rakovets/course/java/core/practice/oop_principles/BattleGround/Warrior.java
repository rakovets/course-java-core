package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(15);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage - 5);
    }
}
