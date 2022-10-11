package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.BusIsFullException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task04;
import java.util.logging.Logger;

public class Demo04 {
    public static final Logger logger = Logger.getLogger(Demo04.class.getName());

    public static void main(String[] args) {
        Task04 task04 = new Task04("Look at my bus, my bus is amazing.");
        int numberOfPassengers = 300;
        try {
            logger.info(String.valueOf(task04.getBusCapacity(numberOfPassengers)));
        } catch (BusIsFullException e) {
            logger.info("Bus is full.");
        }
    }
}
