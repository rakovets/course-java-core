package com.rakovets.course.java.core.practice.exception_handling;

public class Task01 {
    public static void main(String[] args) {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException has been caught.");
        }
    }
}
