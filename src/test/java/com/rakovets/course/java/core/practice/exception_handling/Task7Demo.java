package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.WhoElseWannaPizza;

import java.util.logging.Logger;

public class Task7Demo {
    public static final Logger logger = Logger.getLogger(Task7Demo.class.getName());

    public static void main(String[] args) {
        try {
            Task7.getWhoWantsPizza(16, 3);
        } catch (WhoElseWannaPizza e) {
            logger.info(e.getMessage());
        } finally {
            logger.info("Who wants pizza?");
        }
    }
}
