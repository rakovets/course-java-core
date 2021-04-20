package com.rakovets.course.java.core.example.exception_handling.exception;

public class OutOfRangeRuntimeException extends RuntimeException {
    public OutOfRangeRuntimeException (String outOfRange) {
        super(outOfRange);
    }
}
