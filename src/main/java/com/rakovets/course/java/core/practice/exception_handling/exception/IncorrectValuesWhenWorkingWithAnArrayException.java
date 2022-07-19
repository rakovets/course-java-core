package com.rakovets.course.java.core.practice.exception_handling.exception;

public class IncorrectValuesWhenWorkingWithAnArrayException extends RuntimeException {
    /**
     * Catches the error and displays the appropriate text.
     *
     * @param text the received error.
     */
    public IncorrectValuesWhenWorkingWithAnArrayException(String text) {
        super(text);
    }
}
