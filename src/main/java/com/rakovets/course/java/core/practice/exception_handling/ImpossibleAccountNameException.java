package com.rakovets.course.java.core.practice.exception_handling;

public class ImpossibleAccountNameException extends Exception {

    @Override
    public String getMessage() {
        return "Impossible account name";
    }
}

