package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Arrays;
import java.util.logging.Logger;

public class DemoTask3 {
    public static final Logger logger = Logger.getLogger(DemoTask3.class.getName());

    public static void main(String[] args) {
        Task3 task = new Task3();
        try {
            task.getSumNumbers(-10);
        } catch (SumNumbersException e) {
            logger.severe(Arrays.toString(e.getStackTrace()));
        }
    }
}
