package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(9);
        System.out.printf("%s", "The warrior attacks the enemy");
    }
}
