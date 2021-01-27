package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public abstract class Hero implements Mortal{
    private String name;
    private int health = 100;

    public Hero (String name) {
        this.name = name;
    }

    public Hero (String name, int health) {
        this.name = name;
        if (health > 100) {
        this.health = health;
        }
    }

    public String getName() {
        return this.name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        if (this.health - damage > 0) {
        this.health -= damage;
        } else {
            this.health = 0;
        }
    }

    public int getHealth() {
       return this.health;
    }

    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        }
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
