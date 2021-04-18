package com.rakovets.course.java.core.example.exception_handling.task3;

public class WrongPositivNumberException extends Exception {
    public WrongPositivNumberException() {
        super("You write negative number");
    }

}
