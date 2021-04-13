package com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS;

public class Warrior extends Hero{
    public Warrior(String name,int health) {
        super(name,health);

    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(15);
        System.out.println("u attacking ur enemy");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage - (health * 5 / 100);
    }
}
