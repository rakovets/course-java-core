package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Hero {
    private String name;

    Hero (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int attackEnemy(Enemy enemy);
}
