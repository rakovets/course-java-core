package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask07;

import com.rakovets.course.java.core.practice.exception_handling.Task07;

public class Task07Demo {
    public static void main(String[] args) {

        try {
            Task07.throwException(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сheck completed");
        }
    }
}
