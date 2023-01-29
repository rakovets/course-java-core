package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class NumberIsValidException extends RuntimeException {
    public NumberIsValidException(String message) {
        super(message);
    }
}
