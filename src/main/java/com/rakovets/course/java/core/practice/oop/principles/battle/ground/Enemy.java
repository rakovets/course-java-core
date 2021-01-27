package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public abstract class Enemy implements Mortal{
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public abstract void attackHero(Hero hero);

 }
