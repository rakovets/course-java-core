package com.rakovets.course.javabasics.example.exceptionhandling.exception;

public class AccountExpiredException extends Exception {
    private String debugMessage;

    public AccountExpiredException(String message) {
        super(message);
    }

    public AccountExpiredException(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
