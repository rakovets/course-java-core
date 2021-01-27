package com.rakovets.course.java.core.practice.oop.principles;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (!isAlive()) {
            System.out.println("Враг мертв");
            this.health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        }
        return false;
    }

    public void attackHero(Hero hero) {
        System.out.println("Враг атакует героя");
        hero.takeDamageHero(10);
    }

}
