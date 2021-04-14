package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health = this.health + damage;
    }

    public abstract void attackEnemy(Hero hero);

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
