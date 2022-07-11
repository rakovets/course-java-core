package com.rakovets.course.java.core.practice.exception_handling;

public class Task1Demo {
    public static void main(String[] args) {
        Task1 testStringToNull = new Task1();

        try {
            testStringToNull.catchTheThrownException();
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }
}
