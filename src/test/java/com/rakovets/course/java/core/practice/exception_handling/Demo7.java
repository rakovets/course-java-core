package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task7.MyException;
import com.rakovets.course.java.core.practice.exception_handling.task7.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo7 {
    public static final Logger logger = Logger.getLogger(Demo7.class.getName());

    @Test
    public void testDemoMessageFinally() throws Exception {
        boolean isFinally = false;
        String message = "";
        Task7 task = new Task7();
        try {
            task.getException();
        } catch (MyException ex) {
            message = ex.getMessage();
        } finally {
            isFinally = true;
            logger.log(Level.WARNING, "Exception " + message);
        }

        Assertions.assertTrue(isFinally);
    }
}
