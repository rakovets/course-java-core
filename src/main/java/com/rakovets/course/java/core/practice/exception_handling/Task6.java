package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    public double randomException(double random) throws ArithmeticException, NullPointerException, NumberFormatException {
        if (random >= 0 && random < 0.33) {
            throw new ArithmeticException();
        } else if (random >= 0.33 && random < 0.67) {
            throw new NullPointerException();
        } else {
            throw new NumberFormatException();
        }
    }
}
