package com.rakovets.course.java.core.practice.exception_handling;

public class Task03  {
    public static int throwException(int number) {
        int number1 = 200;
        if (number == 0) {
            throw new ArithmeticException("This is Arithmetic exception");
        } else {
            number1 /= number;
        }
        return number1;
    }

}

