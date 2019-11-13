package com.rakovets.course.challenge.polimorphism;

public abstract class Hero {
    private String name;

    Hero(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void attackEnemy(Enemy enemy);
}