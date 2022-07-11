package com.rakovets.course.java.core.practice.exception_handling.tasks;

public class Task07 {
    private final int ZERO = 0;

    public double extractRoot(int number, int root) throws RuntimeException {
        if (number < ZERO) {
            throw new ArithmeticException("It's impossible to extract the root from negative number.");
        }
        if (root < ZERO) {
            throw new RuntimeException("The number will become a fraction or inversely a number.");
        }
        return Math.pow(number, 1 / root);
    }
}
