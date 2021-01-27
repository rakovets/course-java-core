package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Hero implements Mortal {
    private String name;
    private double health;

    public Hero(String name) {
        this.name = name;
        this.health = 1000;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public abstract String attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return this.health > 0 ? true : false;
    }

    public void takeDamage(double damage) {
        this.health -= damage;
        if (!isAlive()) {
            this.health = 0;
        }
    }


}
