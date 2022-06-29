package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (getHealth() > 50) {
            enemy.takeDamage(10);
        } else {
            enemy.takeDamage(5);
        }
    }
}
