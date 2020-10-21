package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Enemy implements Mortal {
   private int health;

    Enemy(int health){
        this.health = health;
    }

    public int takeDamage(int damage){
      return  health = health - damage;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }
}
