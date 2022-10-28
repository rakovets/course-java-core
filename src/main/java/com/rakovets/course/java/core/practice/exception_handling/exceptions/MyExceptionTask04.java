package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class MyExceptionTask04 extends RuntimeException {
    private String debugMessage;
    private int debugNumber;

    public MyExceptionTask04(String message) {
        super(message);
    }
}
