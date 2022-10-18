package com.rakovets.course.java.core.practice.exception_handling.Task5;

public class Task5 {
    public int divideNumber (int firstNumber, int secondNumber) {
        try {
           firstNumber /= secondNumber;
        } catch (ArithmeticException e) {
            throw new Task5Exception("You are trying to divide by zero!");
        }
        return firstNumber;
    }
}
