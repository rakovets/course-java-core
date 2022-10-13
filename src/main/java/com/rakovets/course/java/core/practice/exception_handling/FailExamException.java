package com.rakovets.course.java.core.practice.exception_handling;

public class FailExamException extends RuntimeException {
    public FailExamException(String message) {
        super(message);
    }
}
