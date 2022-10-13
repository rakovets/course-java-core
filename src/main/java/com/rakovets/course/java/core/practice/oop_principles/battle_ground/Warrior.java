package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(12);
    }

    public void immortal() {
        if (!this.isAlive()) {
            this.setHealth(100);
        }
    }
}
