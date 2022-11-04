package com.rakovets.course.java.core.practice.exception_handling;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}
