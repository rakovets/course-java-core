package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(25);
        System.out.println(this.getName() + " summons fire arrows to destroy enemy!");
    }

    public void fireStorm(Enemy enemy1, Enemy enemy2, Enemy enemy3) {
        enemy1.takeDamage(80);
        enemy2.takeDamage(80);
        enemy3.takeDamage(80);
        System.out.println(this.getName() + " rises his hand and a mighty Firestorm descends on enemies!!!");
    }
}
