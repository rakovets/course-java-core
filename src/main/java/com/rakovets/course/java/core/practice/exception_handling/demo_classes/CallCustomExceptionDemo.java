package com.rakovets.course.java.core.practice.exception_handling.demo_classes;

import com.rakovets.course.java.core.practice.exception_handling.tasks.CustomExceptionSimulation;

public class CallCustomExceptionDemo {
    public static void main(String[] args) {
        try {
            new CustomExceptionSimulation().callException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
