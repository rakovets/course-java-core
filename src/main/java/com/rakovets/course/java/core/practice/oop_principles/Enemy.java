package com.rakovets.course.java.core.practice.oop_principles;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return (health > 0);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void attackHeroes(Hero hero) {
        hero.takeDamage(10);
    }

    public void setHealth (int health) {
        this.health = health;
    }

    public int getHealth () {
        return health;
    }
}
