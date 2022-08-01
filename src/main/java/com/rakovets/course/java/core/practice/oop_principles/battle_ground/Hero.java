package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String attackEnemy() {
        return "The" + name + "attacks the enemy";
    }

    public String getName() {
        return name;
    }
}
