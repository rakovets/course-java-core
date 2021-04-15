package com.rakovets.course.java.core.example.exception_handling.exception;

public class ExceptionExtendsRunTime extends RuntimeException {
    private int index;

    public ExceptionExtendsRunTime(int index) {
        this.index = index;
    }

    public ExceptionExtendsRunTime(String message, int index) {
        super(message);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
