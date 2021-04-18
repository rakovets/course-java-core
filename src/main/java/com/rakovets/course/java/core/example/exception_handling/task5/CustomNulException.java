package com.rakovets.course.java.core.example.exception_handling.task5;

public class CustomNulException extends NullPointerException{
    public CustomNulException(NullPointerException e,String message) {
        super(message);
    }
}
