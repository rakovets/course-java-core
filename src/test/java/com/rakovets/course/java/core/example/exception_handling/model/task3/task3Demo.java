package com.rakovets.course.java.core.example.exception_handling.model.task3;

import com.rakovets.course.java.core.example.exception_handling.task3.Task3;

import java.util.Arrays;

public class task3Demo {
    public static void main (String[] args) {
        try {
            Task3.PositiveNumber(-15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
