package com.rakovets.course.java.core.practice.exception_handling;

public class Task3Exception extends Exception {
    private int number;

    public Task3Exception(String message, int num) {
        super(message);
        number = num;
    }
}
