package com.rakovets.course.java.core.practice.exception_handling.exception;

public class IndexOutOfBoundsException extends Exception {
    /**
     * When this error is detected, displays text indicating the problem.
     */
    public IndexOutOfBoundsException() {
        super("Invalid index.");
    }
}
