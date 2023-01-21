package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public abstract class Hero implements Mortal, TakeDamage {
    private final String NAME;
    private int health = 100;

    public Hero(String name) {
        this.NAME = name;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(0);
        System.out.println("Attack phrase!");
    }

    public String getName() {
        return NAME;
    }
}
