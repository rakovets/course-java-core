package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Hero implements Mortal{
    private static String name;
    private static int health;

    public Hero(String name, int health) {
        Hero.name = name;
        Hero.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        Hero.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void superPower();
}
