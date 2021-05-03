package com.rakovets.course.java.core.practice.exception_handling;

public class Task07Demo {
    public static void main(String[] args) {
        try {
            Task07.throwExceptionHalfTheTime();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("This message");
        }
    }
}
