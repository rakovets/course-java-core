package com.rakovets.course.java.core.practice.oop.principles;

public class Enemy implements Mortal {
    private double health;

    public Enemy(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attackHero() {
        System.out.println("Enemy is attacking");
    }

    public void attackHero(Hero hero) {
        attackHero();
        hero.takeDamage(20);
    }


}
