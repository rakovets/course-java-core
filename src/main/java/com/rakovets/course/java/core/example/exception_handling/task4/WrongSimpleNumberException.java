package com.rakovets.course.java.core.example.exception_handling.task4;

public class WrongSimpleNumberException extends Exception {
    private int number;

    public WrongSimpleNumberException(int number) {
        this.number = number;
    }
    public String toString() {
        return "Number " + number + " is not simple" ;
    }
}
