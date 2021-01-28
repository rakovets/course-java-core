package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Archer extends Hero {
    private int health;

    public Archer(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(50);
    }

    public int addHealth() {
        if (this.health <= 0) {
            return this.health + 500;
        } else {
            return this.health;
        }
    }
}
