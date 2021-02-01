package com.rakovets.course.java.core.practice.exception_handling;

public class NumberCountException extends Exception {
    private final String messageDebug;

    public NumberCountException(String message, String messageDebug) {
        super(message);
        this.messageDebug = messageDebug;
    }

    public String getMessageDebug() {
        return messageDebug;
    }
}
