package com.rakovets.course.java.core.practice.oop.principles;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    public boolean resurrect() {
        return getHealth() > 0;
    }
}
