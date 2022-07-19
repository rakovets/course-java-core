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
    public String checkAge(int age) throws AgeException {
        String greetings = "Welcome to club.";
        int minimalAge = 18;

        if (age < minimalAge) {
            throw new AgeException("The user's age cannot be less than 18 years");
        }
        return greetings;
    }
}
