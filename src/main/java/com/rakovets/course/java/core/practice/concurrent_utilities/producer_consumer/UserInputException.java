package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

public class UserInputException extends Exception {
    private String massage;
    public UserInputException() {
        massage = "Wrong number";
    }
}
