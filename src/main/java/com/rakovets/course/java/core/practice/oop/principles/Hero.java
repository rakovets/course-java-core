package com.rakovets.course.java.core.practice.oop.principles;

public abstract class Hero implements Mortal {
    private String name;
    private int healthHero;

    public Hero(String name) {
        this.name = name;
        this.healthHero = 100;
    }

    public int getHealthHero() {
        return this.healthHero;
    }

    public String getName() {
        return this.name;
    }

    public void takeDamageHero(int damage) {
        this.healthHero -= damage;
        if (!isAlive()) {
            this.healthHero = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return this.healthHero > 0;
    }

    public abstract void attackEnemy(Enemy enemy);

}
