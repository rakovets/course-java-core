package com.rakovets.course.java.core.practice.exception_handling.demo_classes;

import com.rakovets.course.java.core.practice.exception_handling.tasks.ArrayIndexOutOfBoundsExceptionSimulation;

public class CallArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            new ArrayIndexOutOfBoundsExceptionSimulation().callException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
