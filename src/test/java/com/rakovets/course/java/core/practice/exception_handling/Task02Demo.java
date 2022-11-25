package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class Task02Demo {
    public static final Logger logger = Logger.getLogger(Task02Demo.class.getName());

    public static void main(String[] args) {
        Task02 task = new Task02();
        int[] array = {0, 1, 2};
        int indexArray = 5;

        try {
            task.array(array, indexArray);
            logger.info(String.valueOf(array[indexArray]));
        } catch (IndexOutOfBoundsException ex) {
            logger.severe(ex.getMessage());
        }
    }
}
