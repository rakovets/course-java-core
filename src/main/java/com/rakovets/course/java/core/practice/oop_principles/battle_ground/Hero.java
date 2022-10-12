package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private boolean isAlive;

    public Hero(String name, int health, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
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
}
