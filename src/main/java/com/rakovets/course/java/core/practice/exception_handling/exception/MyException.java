package com.rakovets.course.java.core.practice.exception_handling.exception;

public class MyException extends Exception{
    public MyException(RuntimeException message) {
        super(message);
    }
}
