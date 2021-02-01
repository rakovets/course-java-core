package com.rakovets.course.java.core.practice.exception_handling;

public class RootException extends Exception {
    private int x;

    public RootException(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public String toString() {
        return + x + " less than 30";
    }
}
