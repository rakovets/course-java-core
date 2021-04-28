package com.rakovets.course.java.core.practice.oop.principles.project.battle.ground;

public abstract class Hero {
    private final String name;
    private int healthPoint;

    public Hero(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint() {
        if (healthPoint <= 0) {
            System.out.println(name + "\nYour Hero is dead\n");
        }
        return healthPoint;
    }

    public void takeDamage(int damage) {
        healthPoint -= damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract void skill(Enemy... enemy);

    public String getName() {
        return name;
    }
}
