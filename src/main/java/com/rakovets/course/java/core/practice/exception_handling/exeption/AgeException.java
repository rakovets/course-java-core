package com.rakovets.course.java.core.practice.exception_handling.exeption;

public class AgeException extends Exception {
    private int age;

    public AgeException(String message, int age) {
        super(message);
    }
}
