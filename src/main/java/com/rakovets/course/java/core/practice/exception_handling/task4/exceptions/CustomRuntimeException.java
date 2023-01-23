package com.rakovets.course.java.core.practice.exception_handling.task4.exceptions;

public class CustomRuntimeException extends RuntimeException {
    public CustomRuntimeException(String errorMessage) {
        super(errorMessage);
    }
}
