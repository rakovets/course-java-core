package com.rakovets.course.java.core.practice.oop.principles.battle.ground;

public abstract class Hero {
    private String name;
    private int health;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health =- damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void death() {
        if (health <= 0) {
            System.out.println("Герой погиб\nGAME OVER");
        } else {
            System.out.println("Герой все еще жив");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
