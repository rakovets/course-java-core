package com.rakovets.course.java.core.practice.exception_handling;

public class Task1Application {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        try {
            task1.printStringLength();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
