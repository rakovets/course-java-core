package com.rakovets.course.java.core.practice.exception_handling.exception;

public class CheckingCorrectEnteredPhoneNumberException extends NumberFormatException {
    public CheckingCorrectEnteredPhoneNumberException(String message) {
        super(message);
    }
}
