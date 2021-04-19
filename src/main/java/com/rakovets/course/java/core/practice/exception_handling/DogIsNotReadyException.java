package com.rakovets.course.java.core.practice.exception_handling;

public class DogIsNotReadyException extends Exception {
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
