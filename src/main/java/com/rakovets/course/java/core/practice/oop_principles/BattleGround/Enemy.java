package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public abstract class Enemy implements Mortal{
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            die();
        }
    }

    public abstract void attackHero(Hero hero);

    public void die() {
        System.out.println("Hero has died!");
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
