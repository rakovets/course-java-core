package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    public Archer (String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(15);
    }

    public void attackWithCriticalHit(Enemy enemy) {
        enemy.takeDamage(enemy.getHealth());
    }
}
