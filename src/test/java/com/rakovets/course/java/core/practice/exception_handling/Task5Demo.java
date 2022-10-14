package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task5.Array;
import com.rakovets.course.java.core.practice.exception_handling.task5.ArrayException;

import java.util.logging.Logger;

public class Task5Demo {
    public static final Logger logger = Logger.getLogger(Task5Demo.class.getName());

    public static void main(String[] args) {
        Array arr = new Array();
        try {
            arr.showElementOfArray(new int[]{1, 2, 3, 4, 5}, 6);
        } catch (ArrayException e) {
            logger.warning("ERROR: " + e.getMessage());
            logger.info("End of program for task5");
        }
    }
}
