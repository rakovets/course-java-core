package com.rakovets.course.challenge;

public class Archer extends Hero {

    Archer(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("*Лучник стреляет во врага*");
        enemy.takeDamage(35);
        if (enemy.health <= 0) {
            System.out.println(enemy.name + " died");
        }
        if (enemy.health <= 100) {
            enemy.takeDamage(100);
        }
    }
}
