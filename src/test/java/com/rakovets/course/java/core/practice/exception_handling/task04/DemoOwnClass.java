package com.rakovets.course.java.core.practice.exception_handling.task04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoOwnClass {
    public static void main(String[] args) {
        Man man = new Man();
        try {
            man.whatDoesAPersonDo();
        } catch (OwnClass e) {
            final Logger logger = Logger.getLogger(OwnClass.class.getName());
            logger.log(Level.WARNING, "You're doing something wrong");
        }
    }
}
