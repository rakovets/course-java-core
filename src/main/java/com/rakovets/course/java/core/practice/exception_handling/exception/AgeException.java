package com.rakovets.course.java.core.practice.exception_handling.exception;

public class AgeException extends Exception {
    /**
     * Excludes users under 18.
     */
    public AgeException() {
        super("You are under 18 years of age.");
    }
}
