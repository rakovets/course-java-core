package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Mage casts frost-bolt!");
    }
}
