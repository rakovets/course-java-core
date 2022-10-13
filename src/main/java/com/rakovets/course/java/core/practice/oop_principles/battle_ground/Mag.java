package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {
    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(40);
    }

    public void takeEnergy(Enemy enemy) {
        enemy.takeDamage(20);
        this.setHealth(this.getHealth() + 20);
    }
}
