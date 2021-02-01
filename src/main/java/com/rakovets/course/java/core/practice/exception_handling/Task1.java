package com.rakovets.course.java.core.practice.exception_handling;

public class Task1 {
    public static void main(String[] args) {
        String str = null;

        try {
            str.toString();
        } catch (NullPointerException e) {
            System.out.println("Null");
        }
    }
}
