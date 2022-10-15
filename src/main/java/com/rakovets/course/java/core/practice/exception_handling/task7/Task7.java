package com.rakovets.course.java.core.practice.exception_handling.task7;

public class Task7 {
    private int index = 0;
    private final String message = "block finally handles for the case with the usual exception";
    private final Exception[] exceptions = {new MyException(message), new RuntimeException()};

    public void getException() throws Exception {
        Exception exception = null;
        if (this.index == exceptions.length) {
            index = 0;
        }
        exception = exceptions[index];
        index++;
        throw exception;
    }
}
