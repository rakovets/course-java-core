package com.rakovets.course.java.core.practice.exception_handling;

public class Task07_Demo {
    public static void main(String[] args) {
        Task07 task = new Task07();
        int i = (int) Math.random() * 2;
        try {
            task.random50PercentException(i);
        } catch (Exception e) {
            System.out.println("This is Exception");
        } finally {
            System.out.println(i);
        }
    }
}
