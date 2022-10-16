package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.EquilateralTriangleException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.TriangleException;

import java.util.logging.Logger;

public class Task6Demo {
    public static final Logger logger = Logger.getLogger(Task6Demo.class.getName());

    public static void main(String[] args) {
        Task6 task = new Task6();
        try {
            Task6.getException(3, 3, 3);
        } catch (IllegalArgumentException | TriangleException ex) {
            logger.severe("The tryangle does not exist");
        } catch (EquilateralTriangleException e) {
            logger.info(e.getMessage());
        }
    }
}
