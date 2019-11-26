package com.rakovets.course.challenge.solution2;

public class Archer extends Hero {
    Archer(String name) {
        super(name);
    }
    void attackEnemy(Enemy enemy) {
        System.out.println("Yoahoo");
        enemy.takeDamage(5);
    }
}
