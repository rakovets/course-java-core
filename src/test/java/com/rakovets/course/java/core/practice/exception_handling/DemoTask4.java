package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Arrays;
import java.util.logging.Logger;

public class DemoTask4 {
    public static final Logger logger = Logger.getLogger(DemoTask4.class.getName());

    public static void main(String[] args) {
        Task4 task = new Task4();
        String nameList = null;
        try {
            String[] names = task.getArray(nameList);
        } catch (NullStringException e) {
            logger.severe(Arrays.toString(e.getStackTrace()));
        }
    }
}
