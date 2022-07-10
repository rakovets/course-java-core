package com.rakovets.course.java.core.practice.exception_handling.exeption;

public class EmptinessException extends RuntimeException {
    private String message;

    public EmptinessException(String message) {
        super(message);
    }
}
