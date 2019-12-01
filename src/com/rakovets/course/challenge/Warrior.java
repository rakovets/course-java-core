package com.rakovets.course.challenge;

public class Warrior extends Hero {

    Warrior(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("*Воин бьёт врага мечём*");
        enemy.takeDamage(25);
        if (enemy.health <= 0) {
            System.out.println(enemy.name + " died");
        }
        if (this.health < 100) {
            enemy.takeDamage(20);
        }
    }
}
