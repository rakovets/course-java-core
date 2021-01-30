package com.rakovets.course.java.core.practice.exception_handling;

public class ImpossibleAccountNameException extends Exception {
    private final String WRONG_NAME;

    public ImpossibleAccountNameException(String message, String wrongName) {
        super(message);
        this.WRONG_NAME = wrongName;
    }

    public String getWrongName() {
        return WRONG_NAME;
    }
}

