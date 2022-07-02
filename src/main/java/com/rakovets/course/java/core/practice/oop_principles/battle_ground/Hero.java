package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int copyHealth;

    public final int PERCENT_OF_DAMAGE = 10;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
        this.copyHealth = health;
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public abstract void attackEnemy(Enemy enemy, int damage);

    public abstract void takeDamage(int damage);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCopyHealth() {
        return copyHealth;
    }
}
