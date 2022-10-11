package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class BusIsFullException extends RuntimeException{
    public BusIsFullException(String message) {
        super(message);
    }
}
