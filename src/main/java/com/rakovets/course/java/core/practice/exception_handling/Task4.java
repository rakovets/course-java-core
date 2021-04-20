package com.rakovets.course.java.core.practice.exception_handling;


public class Task4 {
    public static int divideByZero() {
        int a = 1;
        int b = a/0;
        return b;
        }
    public static void divide0() {
        throw new DivideException();
    }
}
