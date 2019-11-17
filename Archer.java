package com.rakovets.course.challenge.oopInheritanceAndPolymorphism;

public class Archer extends Hero {
    Archer(String name) {
        super(name);
    }

    @Override
    void attackEnemy() {
        super.attackEnemy();
        System.out.println("Archer attack enemy!");
    }

    @Override
    void attackEnemy(Enemy enemy) {
        super.attackEnemy(enemy);
        enemy.takeDamage(5);
    }
}
