package com.rakovets.course.java.core.practice.exception_handling.task05;

import java.util.NoSuchElementException;

public class NotNumberException extends NoSuchElementException {
    public NotNumberException(String message) {
        super(message);
    }
}
