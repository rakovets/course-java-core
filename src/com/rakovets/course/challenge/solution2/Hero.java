package com.rakovets.course.challenge.solution2;

public  abstract class Hero {
    private String name;
    Hero(String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }
    abstract void attackEnemy(Enemy enemy);
}
