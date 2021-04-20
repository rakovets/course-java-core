package com.rakovets.course.java.core.practice.exception_handling;

public class YesOrNoExceptionDemo {
    public static void main(String[] args) {
        try {
            YesOrNoException.randomException();
        } catch (ArithmeticException e) {
            System.err.println("/");
        } finally {
            System.err.println("///");
        }
    }
}
