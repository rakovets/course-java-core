package com.rakovets.course.challenge;

public class Mag extends Hero{

    Mag(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("*Маг читает заклинание*");
        enemy.takeDamage(30);
        if (enemy.health <= 0) {
            System.out.println(enemy.name + " died");
        }
        if (enemy.health > 400) {
            enemy.takeDamage(10);
        }
    }
}
