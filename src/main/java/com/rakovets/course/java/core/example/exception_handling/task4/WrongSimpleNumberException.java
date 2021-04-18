package com.rakovets.course.java.core.example.exception_handling.task4;

public class WrongSimpleNumberException extends Exception {
    public WrongSimpleNumberException() {
        super("Number is not simple");
    }

}
