package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class CustomerException extends RuntimeException {
    public CustomerException(String massage) {
        super(massage);
    }
}
