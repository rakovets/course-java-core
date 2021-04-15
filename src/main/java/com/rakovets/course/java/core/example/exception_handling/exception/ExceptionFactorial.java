package com.rakovets.course.java.core.example.exception_handling.exception;

public class ExceptionFactorial extends Exception {
    private int number;

    public ExceptionFactorial(int number) {
        this.number = number;
    }

    public ExceptionFactorial(String name, int number) {
        super(name);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
