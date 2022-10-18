package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task2Demo {
    private static final Logger logger = Logger.getLogger(Task2Demo.class.getName());

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        try {
            task2.arrayOutOfBounds();
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.warning("Error - " + e.getMessage());
            logger.severe(Arrays.toString(e.getStackTrace()));
        }
    }
}
