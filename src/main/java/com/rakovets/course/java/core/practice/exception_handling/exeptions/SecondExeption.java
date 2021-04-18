package com.rakovets.course.java.core.practice.exception_handling.exeptions;

public class SecondExeption extends RuntimeException{
    int value;

    public int getValue() {
        return value;
    }

    public SecondExeption(String message, int value){
        super(message);
    }
}

