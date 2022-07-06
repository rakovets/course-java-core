package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.HealthException;

public class Task3 {
    private int health;

    public Task3(int health) {
        this.health = health;
    }

    public void setHealth(int health) throws HealthException {
        if (health < 0 || health > 100) {
            throw new HealthException();
        }
        this.health = health;
    }
}
