package com.rakovets.course.java.core.practice.oop_principles.battle_groud;

public abstract class Hero {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract int attackEnemy(Enemy enemy);

    public boolean isAlive() {
        return health > 0;
    }

    public int takeDamage(int damage) {
        if (isAlive()) {
            setHealth(getHealth() - damage);
        }
        return getHealth();
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
