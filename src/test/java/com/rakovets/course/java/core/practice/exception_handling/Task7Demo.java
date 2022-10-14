package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task7.EvenNumberException;
import com.rakovets.course.java.core.practice.exception_handling.task7.Task7;

import java.util.logging.Logger;

public class Task7Demo {
    public static final Logger logger = Logger.getLogger(Task7Demo.class.getName());

    public static void main(String[] args) {
        Task7 task = new Task7();
        try {
            task.divideEvenNumbers(5, 2);
        } catch (EvenNumberException e) {
            logger.warning("ERROR: " + e.getMessage());
        } catch (ArithmeticException ex) {
            logger.warning("ERROR: " + ex.getMessage());
        } finally {
            logger.info("End of program for task7");
        }
    }
}
