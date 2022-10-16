package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.TriangleException;
import java.util.logging.Logger;

public class Task3Demo {
    public static final Logger logger = Logger.getLogger(Task3Demo.class.getName());

    public static void main(String[] args) throws TriangleException {
        try {
            Task3.getTriangle(8, 1, 1);

        } catch (TriangleException e) {
            logger.severe(e.getMessage());
        }
    }
}
