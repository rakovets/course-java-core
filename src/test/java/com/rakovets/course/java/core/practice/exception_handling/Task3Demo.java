package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Arrays;
import java.util.logging.Logger;
import com.rakovets.course.java.core.practice.exception_handling.Task3.Task3;
import com.rakovets.course.java.core.practice.exception_handling.Task3.Task3Exception;

public class Task3Demo {
    private static final Logger logger = Logger.getLogger(Task3Demo.class.getName());

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        try {
            task3.over21(19);
        } catch (Task3Exception e) {
            logger.warning(e.getMessage());
            logger.severe(Arrays.toString(e.getStackTrace()));
        }
    }
}
