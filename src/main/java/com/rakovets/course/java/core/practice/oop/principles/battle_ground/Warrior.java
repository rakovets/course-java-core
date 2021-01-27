package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    public Warrior (String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
    }
    @Override
    public void takeDamage(int damage) {
        int warriorTanksDamage = damage / 2;
        setHealth(this.getHealth() - warriorTanksDamage);
    }

    public void healWounds(int healing) {
        this.setHealth(this.getHealth() + healing);
    }
}
