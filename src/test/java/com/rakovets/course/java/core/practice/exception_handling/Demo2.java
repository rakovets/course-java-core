package com.rakovets.course.java.core.practice.exception_handling;

public class Demo2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        try {
            System.out.println(task2.createArray(5, 2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
     }
}
