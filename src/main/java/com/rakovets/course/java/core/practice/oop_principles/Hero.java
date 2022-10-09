package com.rakovets.course.java.core.practice.oop_principles;

public class Hero {
    private String name;

    Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void attackEnemy() {
        System.out.println("Hero attacks enemy");
    }
}
