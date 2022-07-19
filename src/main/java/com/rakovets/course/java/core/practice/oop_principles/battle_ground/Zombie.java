package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    public boolean resurrect() {
        return getHealth() > 0;
    }
}
