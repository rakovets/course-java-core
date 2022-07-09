package com.rakovets.course.java.core.practice.exception_handling.exception;

public class IncorrectValuesWhenWorkingWithAnArray extends Exception {
    /**
     * Catches the error and displays the appropriate text.
     *
     * @param text the received error.
     */
    public IncorrectValuesWhenWorkingWithAnArray(String text) {
        super(text);
    }
}
