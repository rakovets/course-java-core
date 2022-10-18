package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Task7.Task7;
import com.rakovets.course.java.core.practice.exception_handling.Task7.Task7Exception;

import java.util.Arrays;
import java.util.logging.Logger;
public class Task7Demo {

    private static final Logger logger = Logger.getLogger(Task7Demo.class.getName());

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        try {
            task7.fillIndex(new int[] {1,2,3,4,0},4);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.warning(e.getMessage());
            logger.severe(Arrays.toString(e.getStackTrace()));
        } catch (Task7Exception x) {
            logger.warning(x.getMessage());
            logger.severe(Arrays.toString(x.getStackTrace()));
        } finally {
            logger.info("Stop running");
        }
    }
}
