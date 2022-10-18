package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task1Demo {
    private static final Logger logger = Logger.getLogger(Task1Demo.class.getName());

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        try {
            task1.toLowerCase();
        } catch (NullPointerException e) {
            logger.warning("Error - " + e.getMessage());
            logger.severe(Arrays.toString(e.getStackTrace()));
        }
    }
}
