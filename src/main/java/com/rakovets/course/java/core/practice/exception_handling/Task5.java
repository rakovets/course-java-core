package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.AgeException;

public class Task5 {
    private int age;

    public Task5(int age) {
        this.age = age;
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("You are a minor", "You don't have an access");
    }
}
