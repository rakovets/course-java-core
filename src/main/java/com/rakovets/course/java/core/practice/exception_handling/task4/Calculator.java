package com.rakovets.course.java.core.practice.exception_handling.task4;

public class Calculator {
    public static int divide(int num1, int num2) {
        int result =  num1 / num2;
        if (num2 == 1) {
            throw new WrongDividerException("Wrong number");
        }
        return  result;
    }
}
