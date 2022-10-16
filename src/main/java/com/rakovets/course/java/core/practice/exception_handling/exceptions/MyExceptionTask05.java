package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class MyExceptionTask05 extends Exception {
    private String debugMessage;

    public MyExceptionTask05(String message) {
        super(message);
    }

    public MyExceptionTask05(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
