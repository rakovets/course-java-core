package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exception.IsPositiveNumberException;

public class Task03 {
    public static String getIsPositiveNumber(int number) throws IsPositiveNumberException {
        final String POSITIVE_NUMBER = "This number is positive";
        if (number > 0) {
            return POSITIVE_NUMBER;
        } else {
            throw new IsPositiveNumberException("This number is negative");
        }
    }
}
