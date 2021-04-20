package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task6 {
    public static void threeExceptions() {
        int number = (int) (Math.random()*3);
        switch (number) {
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new NumberFormatException();
            case 2:
                throw new NullPointerException();
        }
    }
}
