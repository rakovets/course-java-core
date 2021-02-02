package com.rakovets.course.java.core.practice.exception_handling;

public class ImpossibleAccountNameException extends Exception {
    private final String wrongName;

    public ImpossibleAccountNameException(String message, String wrongName) {
        super(message);
        this.wrongName = wrongName;
    }

    public String getWrongName() {
        return wrongName;
    }
}
