package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class AgeException extends Exception {
    private final String debugMessage;

    public AgeException(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
