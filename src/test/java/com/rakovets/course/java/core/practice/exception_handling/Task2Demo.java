package com.rakovets.course.java.core.practice.exception_handling;

public class Task2Demo {
    public static void main(String[] args) {
        Task2 testArray = new Task2();

        try {
            testArray.arrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}

