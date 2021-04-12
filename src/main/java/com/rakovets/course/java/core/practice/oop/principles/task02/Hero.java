package com.rakovets.course.java.core.practice.oop.principles.task02;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int poisonTouch;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy, int damage);

    public abstract int takeDamageFromEnemy (Enemy enemy);

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
