package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Task5.Task5;
import com.rakovets.course.java.core.practice.exception_handling.Task5.Task5Exception;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task5Demo {
    private static final Logger logger = Logger.getLogger(Task5Demo.class.getName());

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        try {
           task5.divideNumber(2022,0);
        } catch (Task5Exception e) {
            logger.warning(e.getMessage());
            logger.severe(Arrays.toString(e.getStackTrace()));
        }
    }
}
