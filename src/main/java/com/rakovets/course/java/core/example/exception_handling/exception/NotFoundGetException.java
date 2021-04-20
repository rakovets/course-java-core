package com.rakovets.course.java.core.example.exception_handling.exception;

public class NotFoundGetException extends Exception {
    public NotFoundGetException(String notFoundText) {
        super(notFoundText);
    }
}
