package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Mag extends Hero {

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(2);
        System.out.printf("%s", "The mag attacks the enemy");
    }
}
