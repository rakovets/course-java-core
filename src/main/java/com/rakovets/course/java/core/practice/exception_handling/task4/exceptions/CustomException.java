package com.rakovets.course.java.core.practice.exception_handling.task4.exceptions;

public class CustomException extends RuntimeException {
    public CustomException(String errorMessage) {
        super(errorMessage);
    }
}
