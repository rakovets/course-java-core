package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class Task06Demo {
    public static final Logger logger = Logger.getLogger(Task06Demo.class.getName());

    public static void main(String[] args) {
        Task06 task = new Task06();
        int processingNumber = 2;

        for (int i = 0; i <= processingNumber; i++) {
            try {
                task.invokingDifferentExceptions(i);
            } catch (ArithmeticException | NumberFormatException ex) {
                logger.severe("Passed value is incorrect!");
            } catch (NullPointerException ex) {
                logger.severe(ex.getMessage());
            }
        }
    }
}

