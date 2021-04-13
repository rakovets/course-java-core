package com.rakovets.course.java.core.practice.oop.principles.BATTLEGROUNDS;

import java.util.Random;

public class Enemy implements Mortal {
    int health;
    public Enemy(int health){
    this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
    health -= damage;
    }


    @Override
    public boolean isAlive() {
        if (health > 0){
            return true;
        }
        else
            System.out.println("gratz, u win this duel");
            return false;
    }

    public void attackEnemy(Hero hero) {
        hero.takeDamage(10);
        System.out.println("enemy attacking u");
    }
}

