package com.rakovets.course.java.core.practice.exception_handling;
import java.util.logging.Logger;

public class Demo4 {
            public static final Logger logger = Logger.getLogger(Demo4.class.getName());
            public static void main(String[] args) {
                int number = -12;
                try {
                    new Task4().numberIsNegative(number);
                } catch (NegativeNumberException e) {
                    logger.severe(e.getMessage());
                }
            }
}

