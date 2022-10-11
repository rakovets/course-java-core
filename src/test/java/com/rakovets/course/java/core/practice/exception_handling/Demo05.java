package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.EmptyStringException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task05;
import java.util.logging.Logger;

public class Demo05 {
    public static final Logger logger = Logger.getLogger(Demo05.class.getName());

    public static void main(String[] args) {
        Task05 task05 = new Task05();
        String str = null;
        try {
            logger.info(String.valueOf(task05.getStringLength(str)));
        } catch (EmptyStringException e) {
            logger.info("Your string leads nowhere.");
        }
    }
}
