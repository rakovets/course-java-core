package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy.getHealth() > 50) {
            enemy.takeDamage(5);
        } else {
            enemy.takeDamage(10);
        }
    }
}
