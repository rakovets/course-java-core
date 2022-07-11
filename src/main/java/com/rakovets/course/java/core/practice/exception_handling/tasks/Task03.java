package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.isPositiveException;

public class Task03 {
    private final String POSITIVE_NUMBER= "Number is positive";

    public String isPositive(int number) throws isPositiveException {
        if(number < 0) {
            throw new isPositiveException("Number isn't positive!");
        } else {
            return POSITIVE_NUMBER;
        }
    }
}
