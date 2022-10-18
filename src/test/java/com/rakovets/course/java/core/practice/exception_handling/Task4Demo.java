package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Arrays;
import java.util.logging.Logger;

import com.rakovets.course.java.core.practice.exception_handling.Task4.Task4;
import com.rakovets.course.java.core.practice.exception_handling.Task4.Task4Exception;

public class Task4Demo {
    private static final Logger logger = Logger.getLogger(Task4Demo.class.getName());

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        try {
            task4.openSecuritiesAccount(13);
        } catch (Task4Exception e) {
            logger.warning(e.getMessage());
            logger.severe(Arrays.toString(e.getStackTrace()));
        }
    }
}
