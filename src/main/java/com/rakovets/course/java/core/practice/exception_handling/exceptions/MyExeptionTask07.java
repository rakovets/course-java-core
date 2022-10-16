package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class MyExeptionTask07 extends Exception {
    private String debugMessage;

    public MyExeptionTask07(String message) {
        super(message);
    }

    public MyExeptionTask07(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
