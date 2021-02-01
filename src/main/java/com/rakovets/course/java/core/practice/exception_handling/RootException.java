package com.rakovets.course.java.core.practice.exception_handling;

public class RootException extends Exception {
    public int x;
    public RootException(int x) {
        this.x = x;
    }

    public String toString() {
        return "Number " + x + " is less zero";
    }
}
