package com.rakovets.course.java.core.practice.exception_handling;

public class Task07Example {
    public static void main(String[] args) {
        try {
            Task07.getRandomException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Block finally");
        }
    }
}
