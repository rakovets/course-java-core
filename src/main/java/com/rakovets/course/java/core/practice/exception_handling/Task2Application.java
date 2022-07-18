package com.rakovets.course.java.core.practice.exception_handling;

public class Task2Application {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        try {
            task2.arrayAddIndex(2, 6);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}
