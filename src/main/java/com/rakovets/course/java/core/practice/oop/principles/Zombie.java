package com.rakovets.course.java.core.practice.oop.principles;

public class Zombie extends Enemy {
    private static final double RESURRECT  = 50;

    public Zombie(double health) {
        super(health);
    }

    public void resurrect() {
        if (!isAlive()) {
            setHealth(RESURRECT);
        }
    }
}
