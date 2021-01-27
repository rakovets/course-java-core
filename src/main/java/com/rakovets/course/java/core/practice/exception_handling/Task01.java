package com.rakovets.course.java.core.practice.exception_handling;

public class Task01 {
    public static void main(String[] args) {

        String string = null;

        try {
            string.toString();
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }
}
