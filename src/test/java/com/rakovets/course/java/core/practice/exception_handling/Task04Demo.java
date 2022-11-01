package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.NegativeNumberException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task04Demo {
    private static final Logger logger = Logger.getLogger(Task04Demo.class.getName());

    public static void main(String[] args) {
        Task04 task04 = new Task04();
        try {
            task04.numberIsNegativeException(-2);
        } catch (NegativeNumberException e) {
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        }

    }
}
