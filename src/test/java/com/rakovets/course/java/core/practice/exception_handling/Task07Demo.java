package com.rakovets.course.java.core.practice.exception_handling;

public class Task07Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Task07.getDecision());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Good Game");
        }
    }
}
