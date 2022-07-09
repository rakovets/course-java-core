package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exception.AgeException;

public class Task03 {
    /**
     * Checks the user's age.
     *
     * @param age user's age.
     * @return greetings text.
     * @throws AgeException if the user is under 18, displays an error text.
     */
    public static String checkAge(int age) throws AgeException {
        final String GREETINGS = "Welcome to club.";
        final int MINIMUM_AGE = 18;

        if (age < MINIMUM_AGE) {
            throw new AgeException();
        }
        return GREETINGS;
    }
}
