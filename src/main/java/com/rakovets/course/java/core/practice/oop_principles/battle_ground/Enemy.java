package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Enemy implements Mortal {
    private int health;

    Enemy (int health) {
        this.health = health;
    }
    public int takeDamage(int damage) {
        return health - damage;
    }

    @Override
    public boolean isAlive(int health) {
      return health > 0 ;
    }

    public void setHealth(){
        this.health = health;
    }
    public int getHealth (int health){
        return health;
    }
}
