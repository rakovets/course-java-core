package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public Hero() {
    }

    public void attackEnemy() {
        System.out.println("Arm attack");
    }

    public String getName() {
        return name;
    }


}
