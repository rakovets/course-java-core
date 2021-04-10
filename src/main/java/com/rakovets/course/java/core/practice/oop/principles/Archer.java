package com.rakovets.course.java.core.practice.oop.principles;

public class Archer extends Hero{

    public void attackEnemy() {
        System.out.println("Лучник атакует");
    }

    @Override
    public void attackEnemy(Enemy enemy) {
       enemy.takeDamage(-15);
    }

    public Archer(String name) {
        super(name);
    }

    public int rainOfArrows(){
        return -50;
    }
}
