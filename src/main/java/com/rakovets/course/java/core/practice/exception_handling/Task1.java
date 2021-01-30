package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String test = null;

        try {
            test.toUpperCase(Locale.ROOT);
            System.out.println(test);
        } catch (Exception nullPointer) {
            System.out.println("Something goes wrong: " + nullPointer.getMessage());
        }
    }
}
