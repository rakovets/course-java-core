package com.rakovets.course.java.core.practice.exception_handling.exception;

public class DivisionOfNumbersExcepton extends ArithmeticException {
    public DivisionOfNumbersExcepton(String text) {
        super("Can't divide by zero");
    }
}
