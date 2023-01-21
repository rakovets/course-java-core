package com.rakovets.course.java.core.practice.oop_principles.battle.ground;

public abstract class Hero implements Mortal{
    private final String NAME;
    private int health;

    public Hero(String name) {
        this.NAME = name;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return NAME;
    }
}
