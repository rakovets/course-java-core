package com.rakovets.course.java.core.practice.exception_handling;

public class YesOrNoException {
    public static void randomException() {
        int number1 = (int) (Math.random() * 2);
        if(number1 == 0) {
            throw new ArithmeticException();
        }
    }
}
