package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task03;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.IsMultipleTwoException;
import java.util.logging.Logger;

public class Demo03 {
    public static final Logger logger = Logger.getLogger(Demo03.class.getName());

    public static void main(String[] args) {
        Task03 task03 = new Task03();
        int number = 2;
        try {
            logger.info(String.valueOf(task03.getIsMultipleTwo(number)));
        } catch (IsMultipleTwoException e) {
            logger.info("This number is not a multiple of two.");
        }
    }
}
