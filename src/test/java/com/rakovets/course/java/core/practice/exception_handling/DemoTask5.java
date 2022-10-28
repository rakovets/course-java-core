package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class DemoTask5 {
    public static final Logger logger = Logger.getLogger(DemoTask5.class.getName());

    public static void main(String[] args) {
        Task5 task = new Task5();
        try {
            task.getArray("");
        } catch (NullStringException e) {
            logger.info(e.getMessage());
        }
    }
}
