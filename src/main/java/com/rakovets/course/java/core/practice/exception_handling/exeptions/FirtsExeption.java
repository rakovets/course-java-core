package com.rakovets.course.java.core.practice.exception_handling.exeptions;

public class FirtsExeption extends Exception{
    private int number;


    public int getNumber() {
        return number;
    }

    public FirtsExeption(String message, int num){
        super(message);
        number = num;

        }
    }


