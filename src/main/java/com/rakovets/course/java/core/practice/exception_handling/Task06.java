package com.rakovets.course.java.core.practice.exception_handling;

public class Task06 {
    public int randomException(int i) throws ArithmeticException, NullPointerException, Exception {
        if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new NullPointerException();
        } else {
            throw new Exception();
        }
    }
}
