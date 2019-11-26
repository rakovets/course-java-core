package com.rakovets.course.challenge.solution2;

public class Enemy {
    private int health;
    Enemy(int health) {
        this.health = health;
    }
    void setHelth(int health) {
        this.health = health;
    }
    int getHealth() {
        return health;
    }
    void takeDamage(int damage){
        health -= damage;
    }
}
