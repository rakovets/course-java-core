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
        int damageResist = damage / 2;
        this.setHealth(Math.max(this.getHealth() - damageResist, 0));
    }

    public void healWounds(int healing) {
        if (this.isAlive()) {
            this.setHealth(this.getHealth() + healing);
        }
    }
}
