package com.rakovets.course.java.core.practice.exception_handling.task4;

public class Incorrect {
    private final String text;

    public Incorrect(String text) {
        this.text = text;
    }

    public void getIncorrectValue() throws IncorrectException {
        throw new IncorrectException(text);
    }
}
