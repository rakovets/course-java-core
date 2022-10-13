package com.rakovets.course.java.core.practice.exception_handling.exeption;

public class ExceptionAge extends Exception {
    private int age;

    public ExceptionAge(String message, int age) {
        super(message);
    }
}
