package com.rakovets.course.java.core.practice.exception_handling;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        super("It is not allowed to divide by zero!");
    }
}
