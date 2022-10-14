package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class Task2Demo {
    public static final Logger logger = Logger.getLogger(Task2Demo.class.getName());

    public static void main(String[] args) {
        Task2 task = new Task2();
        try {
            task.findNumberByIndex(new int[]{1, 2, 3, 4, 5}, 6);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.warning("ERROR: " + e.getMessage());
            logger.info("End of program for task2");
        }
    }
}
