package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.NegativeNumberException;

public class Task04 {
    private int number;

    public int numberIsNegativeException(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("It is negative number");
        }
        return number;
    }
}
