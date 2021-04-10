package com.rakovets.course.java.core.practice.oop.principles;

public class Warrior extends Hero{


    public void attackEnemy() {
        System.out.println("Воин атакует!");
    }


    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(-5);
    }

    public Warrior(String name) {
        super(name);
    }

    public int doomPunch(){
        return -20;
    }

}
