package com.rakovets.course.java.core.practice.reflection;

public class CustomException extends Exception {
    private final String text;

    public CustomException(String text) {
        this.text = text;
    }
}
