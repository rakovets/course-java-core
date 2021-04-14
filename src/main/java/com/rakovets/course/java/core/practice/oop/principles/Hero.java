package com.rakovets.course.java.core.practice.oop.principles;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String attackEnemy () {
        return getName() + " attack enemy";
    }
}
