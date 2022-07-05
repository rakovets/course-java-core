package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;

public class Task3 {
    public void getPositiveNumber(int number) throws ArgumentNegativeException {
        if (number < 0) {
            throw new ArgumentNegativeException("Enter a positive number");
        }
    }
}
