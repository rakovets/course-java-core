package com.rakovets.course.java.core.practice.exception_handling;

public class Task1 {
    public static void main(String[] args) {
        String string = null;

        try {
           int x = string.length();
        } catch (Exception nullEx) {
            System.out.println("String value is " + nullEx.getMessage());
        }
    }
}
