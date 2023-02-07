package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class NumberIsLessThanZeroException extends RuntimeException{
    public NumberIsLessThanZeroException(String message) {
        super(message);
    }
}
