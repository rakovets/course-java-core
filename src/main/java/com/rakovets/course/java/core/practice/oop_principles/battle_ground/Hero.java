package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

abstract class Hero {
    private final String name;

    public Hero(String name) {
        this.name = name;
    }

    public abstract String attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }
}
