package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task02;
import java.util.logging.Logger;

public class Demo02 {
    public static final Logger logger = Logger.getLogger(Demo02.class.getName());

    public static void main(String[] args) {
        Task02 task02 = new Task02();
        int[] array = {1, 2, 3};
        int index = 4;
        try {
            logger.info(String.valueOf(task02.getIndexOfElement(index, array)));
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.info("You are out of array range.");
        }
    }
}
