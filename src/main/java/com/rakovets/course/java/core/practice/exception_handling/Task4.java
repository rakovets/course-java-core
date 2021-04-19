package com.rakovets.course.java.core.practice.exception_handling;

public class Task4 {
    private double number;

    public double setNumber(double number) {
        this.number = number;
        return number;
    }

    public double getNumber() throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number is negative");
        } else {
            return Math.sqrt(number);
        }
    }
}
