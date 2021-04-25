package com.rakovets.course.java.core.practice.exception_handling;

public class Task05 {
    public double getDevisionNumbers(double firstNumber, double secondNumber) throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException();
        }
        return firstNumber / secondNumber;
    }
}
