package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

public abstract class Hero {
    private String name;
    private int healthPoint;

    public Hero(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public abstract void attackEnemy(Enemy enemy);

    public boolean isDead() {
        return healthPoint > 0;
    }

    public abstract void isUniquePower(Enemy enemy);

    public String getName() {
        return name;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
}
