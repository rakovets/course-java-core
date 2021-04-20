package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Arrays;

public class Task4Demo {
    public static void main(String[] args) {
        try {
            Task4.divide0();
        } catch (DivideException e) {
            System.err.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
