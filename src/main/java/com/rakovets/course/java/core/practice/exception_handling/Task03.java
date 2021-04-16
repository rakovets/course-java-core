package com.rakovets.course.java.core.practice.exception_handling;

public class Task03 extends Exception {

    public static int throwException(int number) throws Exception {
        int number1 = 200;
        if (number == 0) {
            throw new ArithmeticException();
        } else {
            number1 /= number;
        }
        return number1;
    }
}
