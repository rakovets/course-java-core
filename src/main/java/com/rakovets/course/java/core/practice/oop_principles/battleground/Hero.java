package com.rakovets.course.java.core.practice.oop_principles.battleground;

public abstract class Hero implements Mortal {
    private final String name;
    private int health;
    private boolean isAlive;

    public Hero(String name, int health, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        } else {
            this.isAlive = false;
            this.setHealth(0);
        }
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
