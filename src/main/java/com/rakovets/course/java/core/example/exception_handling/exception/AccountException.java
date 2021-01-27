package com.rakovets.course.java.core.example.exception_handling.exception;

public class AccountException extends Exception {
    private String debugMessage;

    public AccountException(String message) {
        super(message);
    }

    public AccountException(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
