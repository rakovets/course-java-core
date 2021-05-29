package com.rakovets.course.java.core.practice.exception_handling;

public class Task04 {
    public static int n;
    int a = 4;
    int b = a / n;

    public int division() {
        return b;
    }

    public static void divisionByZero() {
        if (n == 0); {
            throw new DivisionByZeroException();
        }
    }
}
