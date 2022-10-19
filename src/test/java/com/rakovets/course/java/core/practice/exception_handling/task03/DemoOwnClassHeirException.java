package com.rakovets.course.java.core.practice.exception_handling.task03;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoOwnClassHeirException {
    static final Logger logger = Logger.getLogger(DemoOwnClassHeirException.class.getName());

    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.carCheck();
        } catch (OwnClassHeirException check) {
            logger.log(Level.WARNING, "You're doing something wrong");
        }
    }
}
