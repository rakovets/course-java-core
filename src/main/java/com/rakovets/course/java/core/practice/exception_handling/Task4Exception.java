package com.rakovets.course.java.core.practice.exception_handling;

public class Task4Exception extends RuntimeException {
    private String message;

    public Task4Exception(String message) {
        super(message);
    }

}
