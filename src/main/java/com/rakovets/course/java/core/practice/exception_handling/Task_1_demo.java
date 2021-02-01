package com.rakovets.course.java.core.practice.exception_handling;

public class Task_1_demo {
    public static void main(String[] args) {
        try {
            String string = null;
            System.out.println(string.length());
        } catch (NullPointerException ex) {
            System.out.println("Null is defined");
        }
    }
}
