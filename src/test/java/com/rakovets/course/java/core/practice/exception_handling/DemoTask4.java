package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class DemoTask4 {
    public static final Logger logger = Logger.getLogger(DemoTask4.class.getName());

    public static void main(String[] args) {
        String namesList = null;
        try {
            String[] names = Task4.getArray(namesList);
        } catch (NullStringException e) {
            logger.info(e.getMessage());
        }
    }
}
