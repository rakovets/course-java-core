package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class MyExceptionTask06 extends Exception {
    private String debugMessage;

    public MyExceptionTask06(String message) {
        super(message);
    }

    public MyExceptionTask06(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
