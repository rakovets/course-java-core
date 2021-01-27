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
        if (this.isAlive() && enemy.isAlive()) {
            enemy.takeDamage(10);
        }
    }

    @Override
    public void takeDamage(int damage) {
        int warriorTanksDamage = damage / 2;
        if (this.getHealth() - warriorTanksDamage > 0) {
            this.setHealth(this.getHealth() - warriorTanksDamage);
        } else {
            this.setHealth(0);
        }
    }

    public void healWounds(int healing) {
        if (this.isAlive()) {
            this.setHealth(this.getHealth() + healing);
        }
    }
}
