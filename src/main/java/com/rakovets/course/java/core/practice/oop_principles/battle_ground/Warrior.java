package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Warrior extends Hero {
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(3);
        System.out.printf("%s", "The warrior attacks the enemy");
    }
}
