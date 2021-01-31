package com.rakovets.course.java.core.practice.exception_handling;

public class Task7 {
    public static void fiftyPercentChance() throws ArithmeticException, NumberFormatException {
        int x = (int) (Math.random() * 2);

        if (x == 0) {
            throw new ArithmeticException();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
