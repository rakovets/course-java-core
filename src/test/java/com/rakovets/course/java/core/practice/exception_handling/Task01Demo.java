package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task01Demo {
    private static final Logger logger = Logger.getLogger(Task01Demo.class.getName());

    public static void main(String[] args) {
        Task01 task01 = new Task01();
        try {
            task01.catchException();
        } catch (NullPointerException e) {
            logger.log(Level.SEVERE, "NullPointerException.");
            e.printStackTrace();
        }
    }
}
