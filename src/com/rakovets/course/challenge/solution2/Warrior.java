package com.rakovets.course.challenge.solution2;

public class Warrior extends Hero {
    Warrior(String name) {
        super(name);
    }
    void attackEnemy(Enemy enemy) {
        System.out.println("Sparta");
        enemy.takeDamage(10);
    }
}
