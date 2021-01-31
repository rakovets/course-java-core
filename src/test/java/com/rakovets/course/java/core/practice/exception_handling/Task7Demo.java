package com.rakovets.course.java.core.practice.exception_handling;

public class Task7Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Task7.getDecision());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Have a nice day!");
        }
    }
}
