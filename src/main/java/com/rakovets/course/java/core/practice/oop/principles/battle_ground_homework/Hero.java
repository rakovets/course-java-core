package com.rakovets.course.java.core.practice.oop.principles.battle_ground_homework;

public abstract class Hero implements Mortal{
    private String name;
    private int healthPoint;

    public Hero (String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public boolean isAlive() {
        return healthPoint > 0;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint (int health) {
        this.healthPoint = healthPoint;
    }

    public int takeDamage(int damage) {
        if (healthPoint - damage >= 0) {
            return healthPoint -= damage;
        } else {
            return healthPoint = 0;
        }
    }


}
