package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task01;
import java.util.logging.Logger;

public class Demo01 {
    public static final Logger logger = Logger.getLogger(Demo01.class.getName());

    public static void main(String[] args) {
        Task01 task01 = new Task01();
        String str = null;
        try {
            logger.info(String.valueOf(task01.getStringLength(str)));
        } catch (NullPointerException e) {
            logger.info("Your string contains null.");
        }
    }
}
