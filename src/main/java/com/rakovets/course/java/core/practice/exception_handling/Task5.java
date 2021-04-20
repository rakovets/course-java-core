package com.rakovets.course.java.core.practice.exception_handling;

public class Task5 {
    public double getDevideNumbers(double firstNumber, double secondNumber) throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException();
        }
        return firstNumber / secondNumber;
    }
}
