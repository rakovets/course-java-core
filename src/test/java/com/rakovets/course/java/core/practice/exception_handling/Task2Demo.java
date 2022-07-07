package com.rakovets.course.java.core.practice.exception_handling;

public class Task2Demo {
    public static void main(String[] args) {
        Task2 testOutOfBoundsException = new Task2();

        try {
            testOutOfBoundsException.createFillNumsArray(5, 8, 15);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
