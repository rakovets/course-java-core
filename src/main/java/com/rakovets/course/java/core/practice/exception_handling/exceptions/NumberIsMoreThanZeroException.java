package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class NumberIsMoreThanZeroException extends  RuntimeException{
    public NumberIsMoreThanZeroException(String message) {
        super(message);
    }
}
