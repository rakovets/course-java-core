package com.rakovets.course.java.core.practice.io;

public class FileNotExistException extends RuntimeException {
    public FileNotExistException(String message) {
        super(message);
    }
}
