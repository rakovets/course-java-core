package com.rakovets.course.java.core.practice.exception_handling.exeption;

public class MoneyException extends Exception {
    public MoneyException() {
        super("Insufficient funds!");
    }
}
