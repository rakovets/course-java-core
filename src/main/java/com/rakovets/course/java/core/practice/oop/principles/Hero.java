package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Hero {
    private String name;

    public String getName() {
        return name;
    }

    public Hero(String name) {
        this.name = name;
    }

    public abstract void attackEnemy(Enemy enemy);
}
