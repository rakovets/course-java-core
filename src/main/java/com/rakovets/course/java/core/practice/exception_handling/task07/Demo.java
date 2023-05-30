package com.rakovets.course.java.core.practice.exception_handling.task07;

public class Demo {
    public static void main(String[] args) {
        Task task = new Task();
        try {
            Task.myExceptions();
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("another exception");
        }
    }
}
