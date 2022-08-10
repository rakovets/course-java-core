package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ReadNumberException;

public class Task5 {
    public double numberRead(String stringNumber) throws ReadNumberException {
        try {
            return Double.parseDouble(stringNumber);
        } catch (NumberFormatException e) {
            throw new ReadNumberException("String in correct", e);
        }
    }
}
