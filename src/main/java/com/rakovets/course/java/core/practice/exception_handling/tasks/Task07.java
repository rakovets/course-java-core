package com.rakovets.course.java.core.practice.exception_handling.tasks;

public class Task07 {
    public double getDivisionResult(int dividend, int divider) throws RuntimeException {
        if (divider == 0) {
            throw new ArithmeticException("Can't divide by zero!");
        }
        if (dividend == 0) {
            throw new RuntimeException("Dividing zero by any number is zero");
        }
        return dividend / divider;
    }
}
