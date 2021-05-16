package com.rakovets.course.java.core.practice.concurrency;


public class UserInputException extends Exception {
    public String toString() {
        return "The number is negative or you entered not a number";
    }
}
