package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task3.Mark;
import com.rakovets.course.java.core.practice.exception_handling.task3.MarkException;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task3Demo {
    public static final Logger logger = Logger.getLogger(Task1Demo.class.getName());

    public static void main(String[] args) {
        Mark petrov = new Mark(0);
        try {
            petrov.getMark();
        } catch (MarkException e) {
            logger.warning("ERROR: " + e.getMessage());
            logger.warning("Stack trace: " + Arrays.toString(e.getStackTrace()));
            logger.info("End of program for task3");
        }
    }
}
