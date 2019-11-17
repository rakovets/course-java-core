package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Warrior extends Hero {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attackEnemy() {
        super.attackEnemy();
        System.out.println("Warrior attack enemy!");
    }

    @Override
    void attackEnemy(Enemy enemy) {
        super.attackEnemy(enemy);
        enemy.takeDamage(10);
    }
}
