package com.rakovets.course.java.core.practice.exception_handling;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (InterruptedException | NumberFormatException e) {
            System.err.println("InterruptedException OR NumberFormatException");
            e.printStackTrace();
        } catch (IllegalClassFormatException e) {
            System.err.println("IllegalClassFormatException");
            e.printStackTrace();
        }
    }
    public static void someMethod() throws InterruptedException, NumberFormatException, IllegalClassFormatException {
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 1) {
            throw new InterruptedException();
        } else if (i == 2) {
            throw new NumberFormatException();
        } else {
            throw new IllegalClassFormatException();
        }
    }
}
