package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    public void variousExceptions(int i)
            throws NullPointerException, ArithmeticException, Exception {
        if (i == 1) {
            throw new NullPointerException();
        } else if (i == 2) {
            throw new ArithmeticException();
        } else {
            throw new Exception();
        }
    }
}
