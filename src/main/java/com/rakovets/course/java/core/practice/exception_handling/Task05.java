package com.rakovets.course.java.core.practice.exception_handling;

public class Task05 {

    public double divisionNumbers(double number1, double number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException();
        }
        return number1 / number2;
    }
}

