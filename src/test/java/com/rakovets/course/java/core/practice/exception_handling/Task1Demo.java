package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Task1Demo {
    public static final Logger logger = Logger.getLogger(Task1Demo.class.getName());

    public static void main(String[] args) {
        try {
            String str1 = null;
            str1.toUpperCase();
        }
        catch (NullPointerException e) {
            logger.severe("Program is over.");
        }
    }
}
