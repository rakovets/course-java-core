package com.rakovets.course.java.core.example.exception_handling.exception;

public class DivisionZeroException extends ArithmeticException {
    public DivisionZeroException(String message) {
        super("secondNumber = 0");
    }
}
