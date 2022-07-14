package com.rakovets.course.java.core.practice.exception_handling.exception;

public class EmailException extends Exception {
    /**
     * If the email is entered incorrectly, it will display the error text.
     */
    public EmailException(String text) {
        super(text);
    }
}
