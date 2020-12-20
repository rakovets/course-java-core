package com.rakovets.course.javabasics.example.concurrency.common;

/**
 * Demonstration of how to work with StackTrace for current Thread
 */
public class Example12 {
    public static void main(String[] args) {
        printStackTrace();
    }

    public static void printStackTrace() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            System.out.println(stackTraceElement);
        }
    }
}
