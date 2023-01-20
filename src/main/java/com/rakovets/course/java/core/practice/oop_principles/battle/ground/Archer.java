package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("The archer fires an arrow!");
    }
}
