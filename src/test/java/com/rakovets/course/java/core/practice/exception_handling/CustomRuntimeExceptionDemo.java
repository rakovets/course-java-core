package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyRuntimeExceptionOnNullString;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomRuntimeExceptionDemo {
    private final Logger logger = Logger.getLogger(CustomRuntimeExceptionDemo.class.getName());
    private final CustomRuntimeExceptionTask task = new CustomRuntimeExceptionTask();

    public void catchMyExceptionOnNullString(String string) {
        try {
            task.produceMyExceptionOnNullString(string);
        } catch (MyRuntimeExceptionOnNullString exception) {
            logger.log(Level.SEVERE, "Runtime Exception");
            exception.printStackTrace();
        }
    }
}
