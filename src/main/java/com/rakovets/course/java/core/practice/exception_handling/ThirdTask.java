package com.rakovets.course.java.core.practice.exception_handling;

public class ThirdTask {
    public static void isWrongLength(String str) throws StringLength {

        if(str.length() == 1) {
            System.out.println("String length is 1");
        } else {
            throw new StringLength();
        }
    }
}
