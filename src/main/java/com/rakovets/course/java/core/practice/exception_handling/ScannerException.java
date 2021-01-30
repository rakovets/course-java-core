package com.rakovets.course.java.core.practice.exception_handling;

public class ScannerException extends Exception {
//    private String description;
    private int number;

    public int getNumber() {
        return number;
    }

    public ScannerException(String description, int a) {
        super(description);
        number = a;
    }
}
