package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task07;

public class Task07Demo {
    public static void main(String[] args) {
        try {
            Task07.throwExceptionMultiple();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("The end");
        }
    }
}
