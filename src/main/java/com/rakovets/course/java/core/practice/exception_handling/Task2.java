package com.rakovets.course.java.core.practice.exception_handling;

public class Task2 {

    public static void main(String[] args) {
        String[] string = new String[3];

        try {
            string[4] = "exception";
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
