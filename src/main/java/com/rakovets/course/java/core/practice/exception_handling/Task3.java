package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.HealthValueException;

public class Task3 {
    private int health;

    public Task3(int health) {
        this.health = health;
    }

    public void setHealth(int health) throws HealthValueException {
        if (health < 0 || health > 100) {
            throw new HealthValueException();
        }
        this.health = health;
    }
}
