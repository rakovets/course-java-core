package com.rakovets.course.java.core.practice.exception_handling.exception;

public class NullException extends NullPointerException {
    private String debugMessage;

    public NullException(String message) {
        super(message);
    }

    public NullException(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
