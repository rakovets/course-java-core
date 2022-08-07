package com.rakovets.course.java.core.practice.exception_handling;

public class Demo1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        try {
            System.out.println("String length: " + task1.lengthString(null));
        } catch (NullPointerException e) {
            System.err.println("String is null");
        }
    }
}
