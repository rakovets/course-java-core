package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal{
    private double health;

    public Enemy(double health) {
        this.health = health;
    }

    public double takeDamage(double damage) {
        if (isAlive()) {
            this.health -= damage;}
        return this.health;
    }

    public abstract double attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public double setHealth(double health) {
        return health;
    }

    public double getHealth() {
        return this.health;
    }
}

