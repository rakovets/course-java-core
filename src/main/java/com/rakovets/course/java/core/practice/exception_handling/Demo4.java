package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyRunTimeExceptionOnNullString;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo4 {
    Logger logger = Logger.getLogger(Demo4.class.getName());
    Task4 task = new Task4();

    public void demoPrintStackTrace(String string) {
        try {
            task.getMyExceptionOnNullString(string);
        } catch (MyRunTimeExceptionOnNullString exception) {
            {
                logger.log(Level.SEVERE, "Runtime Exception");
                exception.printStackTrace();
            }
        }
    }
}
