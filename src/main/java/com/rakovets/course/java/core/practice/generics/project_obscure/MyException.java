package com.rakovets.course.java.core.practice.generics.project_obscure;

public class MyException extends Exception {
    private String debugMessage;

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
