package com.rakovets.course.java.core.practice.exception_handling.model;

import com.rakovets.course.java.core.practice.exception_handling.exception.HealthException;

public class Health {
    public static int getHealth (int value) throws HealthException {
        if (value > 100) {
            throw new HealthException("Health more than 100");
        } else if (value < 0) {
            throw new HealthException("Health less than 0");
        }
        return value;
    }
}
