package com.rakovets.course.java.core.practice.exception_handling.Exceptions;

public class CarNotAvailableException extends RuntimeException {
    private String car;

    public CarNotAvailableException(String car) {
        this.car = car;
    }

    public String toString() {
        return "Car " + car + " is not available";
    }
}
