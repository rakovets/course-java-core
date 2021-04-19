package com.rakovets.course.java.core.practice.exception_handling;

public class AgeVerificationException extends Exception {
    public AgeVerificationException(String message) {
        System.out.println(message);
    }
}
