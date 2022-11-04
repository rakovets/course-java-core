package com.rakovets.course.java.core.practice.exception_handling;

public class SizeNotFitException extends RuntimeException {
    public SizeNotFitException(String message) {
        super(message);
    }
}
