package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.ExceptionNegativeNumber;

public class Task04 {
    private int number;

    public int numberIsNegativeException(int number) throws ExceptionNegativeNumber {
        if (number < 0) {
            throw new ExceptionNegativeNumber("It is negative number");
        }
        this.number = number;
        return number;
    }
}
