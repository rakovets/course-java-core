package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    private int index = 0;
    private final RuntimeException[] exceptions = {new RuntimeException(), new ArithmeticException(), new NullPointerException()};

    public void getException() {
        RuntimeException exception = null;
        if (this.index == exceptions.length) {
            index = 0;
        }
        exception = exceptions[index];
        index++;
        throw exception;
    }
}
