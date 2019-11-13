package com.rakovets.course.challenge.polimorphism;

public class Enemy implements Mortal {
    private int health;

    Enemy(int health){
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage){
        this.health = this.health - damage;
        return this.health;
    }

    public boolean isAlive(){
        return this.health > 0;
    }
}
