package com.rakovets.course.java.core.practice.exception_handling.task07;

public class Task07 {
    public void stringToDigit(String str) throws StringToNumber, NumberFormatException {
        if (str.equals("12")) {
            throw new StringToNumber("Everything will work out");
        } else if (str.equals("2")) {
            throw new NumberFormatException("It cannot be converted to int");
        }
    }
}
