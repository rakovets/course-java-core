package com.rakovets.course.java.core.practice.exception_handling.task_5;

public class ExistObjectException extends Exception {
    private String description;

    public ExistObjectException(String message, String description) {
        super(message);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
