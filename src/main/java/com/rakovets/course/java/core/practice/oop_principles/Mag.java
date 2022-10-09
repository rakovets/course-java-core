package com.rakovets.course.java.core.practice.oop_principles;

public class Mag extends Hero {
    Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Mag attacks enemy");
    }
}
