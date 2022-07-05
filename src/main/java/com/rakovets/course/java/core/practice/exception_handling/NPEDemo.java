package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NPEDemo {
    Logger logger = Logger.getLogger(NPEDemo.class.getName());
    NPETask task = new NPETask();

    public void getDemoTrimString() {
        try {
            task.trimString();
        } catch (NullPointerException exception) {
            logger.log(Level.SEVERE, "Null Pointer Exception");
        }
    }
}
