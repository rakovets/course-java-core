package com.rakovets.course.java.core.practice.oop.principles;

public class Dragon extends Enemy {
    public Dragon(int health) {
        super(health);
    }

    public int addHealth() {
        if (getHealth() <= 0) {
            return getHealth() + 100;
        } else {
            return getHealth();
        }
    }
}
