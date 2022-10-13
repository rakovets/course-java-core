package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.DivisionTwoNumbersExcepton;

import java.util.DuplicateFormatFlagsException;

public class Task05 {
    private int firstNumber;
    private int secondNumber;

    public int divisionTwoNumber(int firstNumber, int secondNumber) throws DivisionTwoNumbersExcepton {
        int result;
        try {
            result = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            throw new DivisionTwoNumbersExcepton(e.getMessage());
        }
        return result;
    }
}
