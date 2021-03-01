package com.rakovets.course.java.core.practice.concurrency.common.MasterWorker;

public class UserInputException extends Exception {
    private final int number;

    public UserInputException(int number) {
        this.number = number;
    }

    public String toString() {
        return "The number " + number + " is negative";
    }
}
