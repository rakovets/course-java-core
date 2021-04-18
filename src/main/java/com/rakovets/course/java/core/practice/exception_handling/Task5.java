package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeptions.ThirdExeption;

public class Task5 {
    public static int areaOf(int value) throws NullPointerException{
        if (value == 0) {
            throw new NullPointerException("value cannot be zero");
        }
        return value;
    }
    public static int exeptionFor(int value) throws ThirdExeption{
        if (value == 0) {
            throw new ThirdExeption("make value bigger then zero",0);
        } return value;
    }
}


