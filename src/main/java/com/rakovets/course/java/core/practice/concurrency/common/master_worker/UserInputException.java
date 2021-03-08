package com.rakovets.course.java.core.practice.concurrency.common.master_worker;

public class UserInputException extends Exception {
    private String message;

    public UserInputException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
