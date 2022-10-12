package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    private double health;
    public Enemy(double health) {
        this.health = health;
    }
    public abstract void attackHero(Hero hero);
    public void takeDamage(double damage) {
        this.health -= damage;
    }
    public boolean isAlive() {
        return getHealth() > 0;
    }
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
}
