package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class NumberIsNotValidException extends RuntimeException {
    public NumberIsNotValidException(String message) {
        super(message);
    }
}
