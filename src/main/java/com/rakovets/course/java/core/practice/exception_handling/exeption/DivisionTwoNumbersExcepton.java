package com.rakovets.course.java.core.practice.exception_handling.exeption;

public class DivisionTwoNumbersExcepton extends RuntimeException {
    private String message;

    public DivisionTwoNumbersExcepton(String message) {
        super(message);
    }
}
