package com.rakovets.course.java.core.practice.exception_handling.exception;

public class PasswordException extends Exception {
    /**
     * If the password is entered incorrectly, an error text will be displayed.
     */
    public PasswordException(String text) {
        super(text);
    }
}
