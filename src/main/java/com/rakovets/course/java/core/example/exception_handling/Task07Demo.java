package com.rakovets.course.java.core.example.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Task07;

public class Task07Demo {
    public static void main(String[] args) throws Exception {
        try {
            Task07.fiftyPercentException();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("Activated");
        }
    }
}
