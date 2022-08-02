package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

abstract class Hero implements Mortal {
    private final String name;
    private int health;

    public Hero(String name) {
        this.name = name;
        this.health = 100;
    }

    public abstract String attackEnemy(Enemy enemy);

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
