package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
