package com.rakovets.course.java.core.practice.exception_handling;

public class Task1Demo {
    public static void main(String[] args) {
        Task1 testNullException = new Task1();

        try {
            testNullException.strToUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
    }
}
