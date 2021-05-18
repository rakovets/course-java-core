package com.rakovets.course.java.core.practice.concurrency;

import java.util.InputMismatchException;

public class UserInputException extends InputMismatchException {
    private String number;

    public UserInputException(String number) {
        super("Attention! Invalid variable value - " + number);
        this.number = number;
    }
}
