package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.ExceptionFactorial;

public class Task05Demo {
    public static void main(String[] args) {
        Task05 task05 = new Task05();
        try {
            System.out.println(task05.glue("Hello ", "Hi"));
        } catch (NullPointerException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
