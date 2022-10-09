package com.rakovets.course.java.core.practice.oop_principles;

public class Warrior extends Hero {

    Warrior (String name) {
        super(name);
    }


    @Override
    public void attackEnemy() {
        System.out.println("Warrior attacks enemy");
    }
}
