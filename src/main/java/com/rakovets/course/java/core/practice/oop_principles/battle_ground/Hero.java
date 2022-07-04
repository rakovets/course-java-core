package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Hero {
    private String name;

    Hero (String name) {
        this.name = name;
    }

    public String attackEnemy() {
        return "Attack!";
    }
    public String getName() {
        return name;
    }
}
