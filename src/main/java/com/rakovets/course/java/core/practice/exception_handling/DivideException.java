package com.rakovets.course.java.core.practice.exception_handling;

public class DivideException extends RuntimeException{
    public DivideException() {
        super("cannot be divided by zero");
    }
}
