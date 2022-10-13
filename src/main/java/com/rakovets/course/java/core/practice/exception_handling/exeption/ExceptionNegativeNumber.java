package com.rakovets.course.java.core.practice.exception_handling.exeption;

public class ExceptionNegativeNumber extends RuntimeException {
    private String message;

    public ExceptionNegativeNumber(String message) {
        super(message);
    }
}
