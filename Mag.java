package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Mag extends Hero {
    Mag(String name) {
        super(name);
    }

    @Override
    void attackEnemy() {
        super.attackEnemy();
        System.out.println("Mag attack enemy!");
    }

    @Override
    void attackEnemy(Enemy enemy) {
        super.attackEnemy(enemy);
        enemy.takeDamage(20);
    }
}
