package com.rakovets.course.java.core.practice.exception_handling;

public class MyOwnException extends NullPointerException{
    public MyOwnException(NullPointerException e, String text) {
        super(text);
    }
}
