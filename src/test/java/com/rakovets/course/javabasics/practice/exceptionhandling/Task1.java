package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task1 {
    public static void main(String[] args) {

        String string = null;
        try {
            string.toLowerCase();
        } catch (NullPointerException ex) {
            System.out.print("The variable is null");
        }
    }
}
