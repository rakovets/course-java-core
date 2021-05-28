package com.rakovets.course.java.core.example.exception_handling.task6;

import java.util.Random;

public class Task6 {
    public static void myExceptionMetod() {
        switch((int) (Math.random() * 3)) {
            case 1:
                throw new ArithmeticException();
            case 2:
                throw new NullPointerException();
            default:
                throw new ArrayIndexOutOfBoundsException();
        }
    }
}
