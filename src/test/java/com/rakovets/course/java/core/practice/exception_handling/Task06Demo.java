package com.rakovets.course.java.core.practice.exception_handling;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.JavaUtilLogging.logger;

public class Task06Demo {
    public static void main(String[] args) {
        Task06 task = new Task06();

        String[] array = {"2", "0", "6", "a", null};
        String processingNumber = array[1];

        try {
            task.checkCorrectEnteredNumber(processingNumber);
        } catch (ArithmeticException | NumberFormatException ex) {
            logger.severe(ex.getMessage());
        } catch (NullPointerException ex) {
            logger.severe(ex.getMessage());
        }
    }
}

