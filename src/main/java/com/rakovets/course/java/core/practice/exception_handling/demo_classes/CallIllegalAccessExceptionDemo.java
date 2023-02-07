package com.rakovets.course.java.core.practice.exception_handling.demo_classes;

import com.rakovets.course.java.core.practice.exception_handling.tasks.IllegalAccessExceptionSimulation;

public class CallIllegalAccessExceptionDemo {
    public static void main(String[] args) {
        try {
            new IllegalAccessExceptionSimulation().callException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
