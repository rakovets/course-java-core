package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attackHero(Hero hero) {
        attackTemplate();
        hero.takeDamage(20);
    }

    public void attackTemplate() {
        System.out.println("---Враг атакует героя---");
    }

    public void death() {
        System.out.println("Враг повержен\nGAME WIN");
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
