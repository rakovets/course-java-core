package com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS;

public class Mag extends Hero{
    public Mag(String name,int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(50);
        takeDamage(20);
        System.out.println("u attacking ur enemy");
    }
}
