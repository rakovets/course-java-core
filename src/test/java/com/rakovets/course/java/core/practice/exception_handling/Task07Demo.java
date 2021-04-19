package com.rakovets.course.java.core.practice.exception_handling;

public class Task07Demo {
    public static void main(String[] args) throws Exception {
        try {
            Task07.random();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("Finally has been activated");
        }
    }
}
