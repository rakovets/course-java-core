package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public class Enemy implements Mortal {
    private int healthy;

    public Enemy(int healthy) {
        this.healthy = healthy;
    }

    public void takeDamage(int damage) {
        healthy -= damage;
    }

    @Override
    public boolean isAlive() {
        return healthy > 0;
    }

    public void attack(int damage, Hero hero) {
        hero.setHealthPoint(hero.getHealthPoint() - damage);
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }
}
