package com.rakovets.course.challenge.solution2;

public class Mag extends Hero {
    Mag(String name) {
        super(name);
    }
    void attackEnemy(Enemy enemy) {
        System.out.println("Avacadabra");
        enemy.takeDamage(15);
    }
}
