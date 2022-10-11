package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.IsMultipleTwoException;

public class Task03 {
    private final String MULTIPLE_TWO = "This number is a multiple of two";
    public String getIsMultipleTwo(int number) throws IsMultipleTwoException {
        if (number % 2 == 0) {
            return MULTIPLE_TWO;
        } else {
            throw new IsMultipleTwoException("This number is not a multiple of two.");
        }
    }
}
