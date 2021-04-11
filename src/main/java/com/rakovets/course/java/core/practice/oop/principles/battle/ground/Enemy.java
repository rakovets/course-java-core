package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health =- damage;
    }

    public void attackHero(Hero hero) {
        System.out.println("Враг атакует героя в ответ\n");
        hero.takeDamage(20);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
