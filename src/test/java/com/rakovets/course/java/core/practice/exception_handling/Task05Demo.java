package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.DivisionTwoNumbersExcepton;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task05Demo {
    private static final Logger logger = Logger.getLogger(Task05Demo.class.getName());

    public static void main(String[] args) {
        Task05 task05 = new Task05();
        try {
            task05.divisionTwoNumber(2, 0);
        } catch (DivisionTwoNumbersExcepton e) {
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        }
    }
}
