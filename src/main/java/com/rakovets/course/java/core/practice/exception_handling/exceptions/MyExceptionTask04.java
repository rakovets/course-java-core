package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class MyExceptionTask04 extends RuntimeException {
    private String debugMessage;
    private int debugNumber;

    public MyExceptionTask04(String message) {
        super(message);
    }

    public MyExceptionTask04(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
