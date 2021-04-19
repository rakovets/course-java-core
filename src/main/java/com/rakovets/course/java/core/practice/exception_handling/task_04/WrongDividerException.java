package com.rakovets.course.java.core.practice.exception_handling.task_04;

public class WrongDividerException extends  RuntimeException {
    public WrongDividerException(String message) {
        super(message);
    }
}
