package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.AgeException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task03Demo {
    private static final Logger logger = Logger.getLogger(Task03Demo.class.getName());

    public static void main(String[] args) {
        Task03 task03 = new Task03();
        try {
            task03.adult(17);
        } catch (AgeException e) {
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        }
    }
}
