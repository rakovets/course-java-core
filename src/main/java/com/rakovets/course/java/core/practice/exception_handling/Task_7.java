package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task_7 {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally");
        }
    }

    public static void someMethod() throws InterruptedException {
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 1) {
            throw new InterruptedException("Interrupted format exception");
        }
    }
}
