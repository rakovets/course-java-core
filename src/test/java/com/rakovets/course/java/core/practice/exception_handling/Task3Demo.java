package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.HealthValueException;

public class Task3Demo {
    public static void main(String[] args) {
        Task3 hero = new Task3(50);

        try {
            hero.setHealth(120);
        } catch (HealthValueException e) {
            e.printStackTrace();
        }
    }
}
