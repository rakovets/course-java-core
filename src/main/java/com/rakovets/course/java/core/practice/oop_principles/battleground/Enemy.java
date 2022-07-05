package com.rakovets.course.java.core.practice.oop_principles.battleground;

public abstract class Enemy implements Mortal {
    private int health;
    private boolean isAlive;

    public Enemy(int health, boolean isAlive) {
        this.health = health;
        this.isAlive = isAlive;
    }

    public void takeDamage (int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        } else {
            this.isAlive = false;
            this.setHealth(0);
        }
    }

    public abstract void attackHero(Hero hero);

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
