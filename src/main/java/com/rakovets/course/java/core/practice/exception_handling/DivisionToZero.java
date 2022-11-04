package com.rakovets.course.java.core.practice.exception_handling;

public class DivisionToZero extends RuntimeException {
    private String message;
    public DivisionToZero(String message) {
        super(message);
    }
}
