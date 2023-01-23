package com.rakovets.course.java.core.practice.exception_handling;

public class Demo2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();

        try {
            task2.ArrayIndexOutOfBoundsException();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
