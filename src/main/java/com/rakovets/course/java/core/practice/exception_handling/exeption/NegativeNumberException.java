package com.rakovets.course.java.core.practice.exception_handling.exeption;

public class NegativeNumberException extends RuntimeException {
    private String message;

    public NegativeNumberException(String message) {
        super(message);
    }
}
