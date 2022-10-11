package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task07;
import java.util.logging.Logger;

public class Demo07 {
    public static final Logger logger = Logger.getLogger(Demo07.class.getName());

    public static void main(String[] args) {
        Task07 task07 = new Task07();
        int dividend = 0;
        int divider = 10;
        try {
            logger.info(String.valueOf(task07.getDivisionResult(dividend, divider)));
        } catch (RuntimeException e) {
            logger.info(e.getMessage());
        } finally {
            logger.info("Just finally.");
        }
    }
}
