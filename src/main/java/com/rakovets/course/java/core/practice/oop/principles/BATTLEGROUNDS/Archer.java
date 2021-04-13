package com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS;

public class Archer extends Hero{
    public Archer(String name,int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy instanceof Beast){
            enemy.takeDamage(40);
        }
        else {
            enemy.takeDamage(20);
        }
        System.out.println("u attacking ur enemy");
    }
}
