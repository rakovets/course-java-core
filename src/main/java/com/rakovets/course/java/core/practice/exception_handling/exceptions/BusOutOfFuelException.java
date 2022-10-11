package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class BusOutOfFuelException extends RuntimeException {
    public BusOutOfFuelException(String message) {
        super(message);
    }
}
