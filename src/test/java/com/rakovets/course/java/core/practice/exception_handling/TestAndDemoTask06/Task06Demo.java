package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask06;

import com.rakovets.course.java.core.practice.exception_handling.Task06;

public class Task06Demo {
    public static void main(String[] args) {

        try {
            Task06.throwException(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
