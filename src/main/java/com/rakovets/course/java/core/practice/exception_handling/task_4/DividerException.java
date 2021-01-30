package com.rakovets.course.java.core.practice.exception_handling.task_4;

public class DividerException extends RuntimeException {
    private String message;

    public DividerException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
