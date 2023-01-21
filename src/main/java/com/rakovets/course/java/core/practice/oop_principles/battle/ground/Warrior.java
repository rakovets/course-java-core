package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println("Warrior attacks with sword!");
    }

    public void bladeFury(Enemy enemy1, Enemy enemy2) {
        enemy1.takeDamage(25);
        enemy2.takeDamage(25);
        System.out.println(this.getName() + " attacks with insane speed!");
    }
}
