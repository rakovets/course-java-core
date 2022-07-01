package com.rakovets.course.java.core.practice.oop_principles.Battle_Ground;

public abstract class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String attackEnemy() {
        return "The hero attacks the enemy";
    }

    public abstract void attackEnemy(Enemy enemy);


    public String getName() {
        return this.name;
    }
}
