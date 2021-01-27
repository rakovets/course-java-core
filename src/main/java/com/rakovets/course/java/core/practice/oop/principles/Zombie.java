package com.rakovets.course.java.core.practice.oop.principles;

public class Zombie extends Enemy {

    public Zombie(double health) {
        super(health);
    }

    public void resurrect() {
        if (!isAlive()) {
            setHealth(500);
        }
    }

}
