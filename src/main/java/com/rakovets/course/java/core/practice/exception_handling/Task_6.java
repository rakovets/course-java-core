package com.rakovets.course.java.core.practice.exception_handling;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (InterruptedException | NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalClassFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void someMethod() throws InterruptedException, NumberFormatException, IllegalClassFormatException {
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 1) {
            throw new InterruptedException("Interrupted format exception");
        } else if (i == 2) {
            throw new NumberFormatException("Check format number");
        } else {
            throw new IllegalClassFormatException("Check format");
        }
    }

}
