package com.rakovets.course.java.core.practice.oop_principles.battle_ground;


public class Mag extends Hero {
    public Mag(String name, double health) {
        super(name, health);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(50);
    }
}
