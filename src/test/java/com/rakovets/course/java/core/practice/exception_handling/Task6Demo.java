package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Task6.Task6;
import com.rakovets.course.java.core.practice.exception_handling.Task6.Task6Exception;
import com.rakovets.course.java.core.practice.exception_handling.Task6.Task6LoginException;
import com.rakovets.course.java.core.practice.exception_handling.Task4.Task4Exception;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task6Demo {
    private static final Logger logger = Logger.getLogger(Task6Demo.class.getName());

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        try {
            task6.openSecuritiesAccount(14,false,"nikita");
        } catch (Task4Exception | Task6LoginException e) {
            logger.severe(e.getMessage());
            logger.severe(Arrays.toString(e.getStackTrace()));
        } catch (Task6Exception e) {
            logger.warning(e.getMessage());
            logger.severe(Arrays.toString(e.getStackTrace()));
        }
    }
}
