package com.rakovets.course.java.core.practice.exception_handling.task07;

public class StringToNumber extends IllegalArgumentException {
    public StringToNumber(String message) {
        super(message);
    }
}
