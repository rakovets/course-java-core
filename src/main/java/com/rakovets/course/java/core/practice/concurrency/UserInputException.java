package com.rakovets.course.java.core.practice.concurrency;

public class UserInputException extends Exception {
    private String number;

    public UserInputException(String number) {
        super("Attention! Invalid variable value - " + number + ";");
        this.number = number;
    }
}
