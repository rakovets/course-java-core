package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Hero implements Mortal {
    private static String name;
    private static int health;

    public Hero(String name, int health) {
        Hero.name = name;
        Hero.health = health;
    }

    public abstract String attackEnemy();

    public int takeDamage(int damage) {
        return Enemy.takeDamage(damage);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
