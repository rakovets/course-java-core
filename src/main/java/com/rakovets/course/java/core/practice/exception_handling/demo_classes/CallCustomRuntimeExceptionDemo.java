package com.rakovets.course.java.core.practice.exception_handling.demo_classes;

import com.rakovets.course.java.core.practice.exception_handling.tasks.CustomRuntimeExceptionSimulation;

public class CallCustomRuntimeExceptionDemo {
    public static void main(String[] args) {
        try {
            new CustomRuntimeExceptionSimulation().callException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
