package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public abstract class Hero implements Mortal{
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = this.health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void die() {
        System.out.println(getName() + " has died!");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            die();
        }
    }

    public abstract void attackEnemy(Enemy enemy, int damage);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
