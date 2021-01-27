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
            System.out.println("Герой мертв");
            this.healthHero = 0;
        }
    }

    @Override
    public boolean isAlive() {
        if (this.healthHero > 0) {
            return true;
        }
        return false;
    }

    public abstract void attackEnemy(Enemy enemy);

}
