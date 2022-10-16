package com.rakovets.course.java.core.practice.exception_handling;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.JavaUtilLogging.logger;

public class Task02Demo {
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
