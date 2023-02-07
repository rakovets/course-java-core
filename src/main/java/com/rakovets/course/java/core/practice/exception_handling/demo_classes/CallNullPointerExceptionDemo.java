package com.rakovets.course.java.core.practice.exception_handling.demo_classes;

import com.rakovets.course.java.core.practice.exception_handling.tasks.NullPointerExceptionSimulation;

public class CallNullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            new NullPointerExceptionSimulation().callException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
