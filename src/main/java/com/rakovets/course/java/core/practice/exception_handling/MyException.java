package com.rakovets.course.java.core.practice.exception_handling;

public class MyException extends ArithmeticException {
    public MyException(String message) {
        super("This is ArithmeticException");
    }
}
