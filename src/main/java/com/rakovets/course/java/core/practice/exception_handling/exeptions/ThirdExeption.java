package com.rakovets.course.java.core.practice.exception_handling.exeptions;

public class ThirdExeption extends Exception{
    int value;

    public int getValue() {
        return value;
    }

    public ThirdExeption(String message,int value){
        super(message);
    }
}
