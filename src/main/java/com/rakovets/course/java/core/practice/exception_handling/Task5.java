package com.rakovets.course.java.core.practice.exception_handling;

public class Task5 {
    public int divisionToZero(int number) {
        int result;
        try {
            result = number / 0;
        } catch (ArithmeticException e) {
            throw new DivisionToZero(e.getMessage());
        }
        return result;
    }
}
