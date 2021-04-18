package com.rakovets.course.java.core.example.exception_handling.model.task4;

import com.rakovets.course.java.core.example.exception_handling.task4.Task4;

import java.util.Arrays;

public class Task4Demo {
    public static void main(String[] args) {
        try {
            System.out.println(Task4.SimpleNumber(43));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
