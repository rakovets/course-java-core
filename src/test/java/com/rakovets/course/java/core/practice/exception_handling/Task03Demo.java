package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.LongCheckUserNameException;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task03Demo {
    public static final Logger logger = Logger.getLogger(Task03Demo.class.getName());

    public static void main(String[] args) {
        Task03 task = new Task03();
        String userName = "Us";

        try {
            task.longCheckUserName(userName);
            logger.info(userName);
        } catch (LongCheckUserNameException ex) {
            logger.severe(ex.getMessage());
            logger.severe(Arrays.toString(ex.getStackTrace()));
        }
    }
}
