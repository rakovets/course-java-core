package com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS;

public abstract class Hero {
    final String name;
    int health;


public Hero (String name, int health){
    this.name = name;
    this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public boolean die(int health){
    if(health>0){
        return false;
    }
    else {
        System.out.println("u died");
        return true;
    }
    }


    public void attackEnemy(Enemy enemy){
    }
}
