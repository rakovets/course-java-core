package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class RootException extends Exception {
    private int x;

    public RootException(int x) {
        this.x = x;
    }

    public String toString() {
        return "The number " + x + " is less than zero";
    }
}
