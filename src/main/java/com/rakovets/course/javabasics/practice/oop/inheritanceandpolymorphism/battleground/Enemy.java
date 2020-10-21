package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Enemy implements Mortal {
    int health;

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

    public void attackHero(Hero hero){
            }

    @Override
    public boolean isAlive() {
       return health > 0;
    }
}
