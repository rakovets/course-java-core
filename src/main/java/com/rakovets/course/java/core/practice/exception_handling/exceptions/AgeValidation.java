package com.rakovets.course.java.core.practice.exception_handling.exceptions;

public class AgeValidation extends RuntimeException {
    public AgeValidation(String massage) {
        super(massage);
    }
}
